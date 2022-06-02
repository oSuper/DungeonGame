package customclasses;

import ea.Knoten;
//import stdclasses.BILD;
import stdclasses.FIGUR;
import stdclasses.KAMERA;
import stdclasses.SPIEL;
import stdclasses.TASTE;

public class Game extends SPIEL {

	// Manager m = new Manager();
	private static int dimension = 64;

	Knoten knoten = new Knoten();
	int xRoom = 1;
	int yRoom = 1;
	Dungeon Dungeon;
	KAMERA cam;
	FIGUR player;
	private String stddir = "./DungeonImages";
	private LoadBild n;
	private double posx = 1.5 * dimension, posy = 1.5 * dimension;

	public Game(int width, int height) {
		super(width, height);
	}

	public Game() {
		super(17 * dimension, 9 * dimension);
		cam = new KAMERA();
		/*
		 * int[][] room1 = R.room1; int[][] room2 = R.room2; int dx = 32, dy = 32; float
		 * deg = 0; StringBuilder sb = new StringBuilder(50); sb.append(stddir); // for
		 * (int i = 0; i < width/64+1; i++) { //Abfrage in x-Richtung anhand des //
		 * Parameters width von getWidth() aus Main.java for (int i = 0; i < 17; i++) {
		 * // Abfrage in x-Richtung for (int j = 0; j < 9; j++) { // Abfrage in
		 * y-Richtung switch (room1[j][i]) { case R._BODEN_:
		 * sb.append("/img/Boden.png"); break; case R.ECKE_LO:
		 * sb.append("/img/EckeObenLinks.png"); break; case R.ECKE_RO:
		 * sb.append("/img/EckeObenLinks.png"); deg = 90; //
		 * sb.append("/img/EckeObenRechts.png"); break; case R.ECKE_LU:
		 * sb.append("/img/EckeObenLinks.png"); deg = -90; //
		 * sb.append("/img/EckeUntenLinks.png"); break; case R.ECKE_RU:
		 * sb.append("/img/EckeObenLinks.png"); deg = 180; //
		 * sb.append("/img/EckeUntenRechts.png"); break; case R._WAND_O:
		 * sb.append("/img/WandOben.png"); break; case R._WAND_U:
		 * sb.append("/img/WandOben.png"); deg = 180; //
		 * sb.append("/img/WandUnten.png"); break; case R._WAND_L:
		 * sb.append("/img/WandOben.png"); deg = -90; //
		 * sb.append("/img/WandLinks.png"); break; case R._WAND_R:
		 * sb.append("/img/WandOben.png"); deg = 90; //
		 * sb.append("/img/WandRechts.png"); break; case R._DOOR_O:
		 * sb.append("/img/DoorTop.png"); break; case R._DOOR_U:
		 * sb.append("/img/DoorTop.png"); deg = 180; break; case R._DOOR_R:
		 * sb.append("/img/DoorTop.png"); deg = 90; break; case R._DOOR_L:
		 * sb.append("/img/DoorTop.png"); deg = -90; break; case R.TELEPORTER:
		 * sb.append("/img/Teleporter_2.png"); break; case R.WASSER:
		 * sb.append("/img/Wasser_2.png"); break; case R.GRASS:
		 * sb.append("/img/Grass.png"); break;
		 * 
		 * }
		 * 
		 * BILD b = new BILD(dx, dy, sb.toString()); if (deg != 0) { b.drehenUm(deg);
		 * deg = 0; } knoten.add(b); sb.delete(stddir.length(), sb.length()); dy += 64;
		 * } dy = 32; dx += 64; }
		 */
		generation(R.room1, 0, 0);
		generation(R.room2, 0, (int) (9 * dimension));
		// n = new LoadBild((int)(1.5 * dimension), (int)(1.5 * dimension),
		// stddir.concat("/img/Figur.png"), dimension);
		n = new LoadBild((int) (dimension), (int) (dimension), stddir.concat("/img/Figur.png"), dimension);
		// n.addCam(dimension);
		posx = (1.5 * dimension);
		posy = (1.5 * dimension);
		cam.setzeBounds(0, 0, 17 * dimension, 9 * dimension);
		cam.setzeFokus(n.getB());

	}

	@Override
	public void tasteReagieren(int code) {
		switch (code) {
		case TASTE.OBEN:
		case TASTE.W:
			/*
			 * if(this.posy-64 == 32 && this.posx == 544) { n.setzeDrehwinkel(0);
			 * cam.setzeBounds(0,576,5120,2880); n.bewegen(0,576); this.posy += 576; }
			 */
			n.setzeDrehwinkel(0);
			if (this.posy > 1.5 * dimension) {
				n.bewegen(0, -dimension);
				this.posy -= dimension;
			}
			break;
		case TASTE.RECHTS:
		case TASTE.D:
			n.setzeDrehwinkel(-25);
			if (this.posx < 15 * dimension) {
				n.bewegen(+dimension, 0);
				this.posx += dimension;
			}
			break;
		case TASTE.UNTEN:
		case TASTE.S:
			n.setzeDrehwinkel(0);
			if (this.posy + dimension == 8.5 * dimension && this.posx == 8.5 * dimension) {
				cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension);
				n.bewegen(0, 3 * dimension);
				this.posy += 3 * dimension;
			} else if (this.posy < 7 * dimension) {
				n.bewegen(0, +dimension);
				this.posy += dimension;
			} else if (this.posy < 16 * dimension && this.posy >= 17 * dimension) {
				n.bewegen(0, +dimension);
				this.posy += dimension;
			}
			break;
		case TASTE.LINKS:
		case TASTE.A:
			n.setzeDrehwinkel(25);
			if (this.posx > 1.5 * dimension) {
				n.bewegen(-dimension, 0);
				this.posx -= dimension;
			}
			break;
		case TASTE.R: // allgemeiner Kamera-Reset, muss bei neuen Räumen angepasst werden
			if (this.posy < 9 * dimension) {
				cam.setzeBounds(0, 0, 17 * dimension, 9 * dimension);
			} else if (this.posy > 576) {
				cam.setzeBounds(0, 9 * dimension, 17 * dimension, 9 * dimension);
			}
			break;
		default:
			System.out.println("Falsche Taste!");
			break;
		}
	}

	public void generation(int[][] room, int x, int y) {
		StringBuilder sb = new StringBuilder(50);
		sb.append(stddir);
		int dy = y;
		float deg = 0;
		for (int i = 0; i < 17; i++) { // Abfrage in x-Richtung
			for (int j = 0; j < 9; j++) { // Abfrage in y-Richtung
				switch (room[j][i]) {
				case R._BODEN_:
					sb.append("/img/Boden.png");
					break;
				case R.ECKE_LO:
					sb.append("/img/EckeObenLinks.png");
					break;
				case R.ECKE_RO:
					sb.append("/img/EckeObenLinks.png");
					deg = 90;
					// sb.append("/img/EckeObenRechts.png");
					break;
				case R.ECKE_LU:
					sb.append("/img/EckeObenLinks.png");
					deg = -90;
					// sb.append("/img/EckeUntenLinks.png");
					break;
				case R.ECKE_RU:
					sb.append("/img/EckeObenLinks.png");
					deg = 180;
					// sb.append("/img/EckeUntenRechts.png");
					break;
				case R._WAND_O:
					sb.append("/img/WandOben.png");
					break;
				case R._WAND_U:
					sb.append("/img/WandOben.png");
					deg = 180;
					// sb.append("/img/WandUnten.png");
					break;
				case R._WAND_L:
					sb.append("/img/WandOben.png");
					deg = -90;
					// sb.append("/img/WandLinks.png");
					break;
				case R._WAND_R:
					sb.append("/img/WandOben.png");
					deg = 90;
					// sb.append("/img/WandRechts.png");
					break;
				case R._DOOR_O:
					sb.append("/img/DoorTop.png");
					break;
				case R._DOOR_U:
					sb.append("/img/DoorTop.png");
					deg = 180;
					break;
				case R._DOOR_R:
					sb.append("/img/DoorTop.png");
					deg = 90;
					break;
				case R._DOOR_L:
					sb.append("/img/DoorTop.png");
					deg = -90;
					break;
				case R.TELEPORTER:
					sb.append("/img/Teleporter_2.png");
					break;
				case R.WASSER:
					sb.append("/img/Wasser_2.png");
					break;
				case R.GRASS:
					sb.append("/img/Grass.png");
					break;

				}

				LoadBild b = new LoadBild(x, dy, sb.toString(), dimension);
				if (deg != 0) {
					b.drehenUm(deg);
					deg = 0;
				}
				// knoten.add(b);
				sb.delete(stddir.length(), sb.length());
				dy += dimension;
			}
			dy = y;
			x += dimension;
		}
	}
	
}