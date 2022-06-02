package customclasses;

import ea.Knoten;
import stdclasses.BILD;
import stdclasses.FIGUR;
import stdclasses.KAMERA;
import stdclasses.SPIEL;
import stdclasses.TASTE;

public class Game2 extends SPIEL {

	// Manager m = new Manager();
	Knoten knoten = new Knoten();
	int xRoom = 1;
	int yRoom = 1;
	Dungeon Dungeon;
	KAMERA cam;
	// private int k = 32;
	FIGUR player;
	private String stddir = "./DungeonGame";
	private BILD n;
	private int posx = 96, posy = 96;
	private int room = 1;

	public Game2(int width, int height) {
		super(width, height);
	}

	public Game2() {
		super(1088, 576);
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
		generation(R.room1, 32, 32);
		generation(R.room2, 32, 608);
		n = new BILD(96, 96, stddir.concat("/img/Figur.png"));
		posx = 96;
		posy = 96;
		cam.setzeBounds(0, 0, 1088, 576);

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
			if (this.posy > 96) {
				n.bewegen(0, -64);
				this.posy -= 64;
			}
			break;
		case TASTE.RECHTS:
		case TASTE.D:
			n.setzeDrehwinkel(-25);
			if (this.posx < 960) {
				n.bewegen(+64, 0);
				this.posx += 64;
			}
			break;
		case TASTE.UNTEN:
		case TASTE.S:
			n.setzeDrehwinkel(0);
			if (this.posy + 64 == 544 && this.posx == 544) {
				cam.setzeBounds(0, 576, 1088, 1152);
				n.bewegen(0, 192);
				this.posy += 192;
			} else if (this.posy < 448) {
				n.bewegen(0, +64);
				this.posy += 64;
			}
			break;
		case TASTE.LINKS:
		case TASTE.A:
			n.setzeDrehwinkel(25);
			if (this.posx > 96) {
				n.bewegen(-64, 0);
				this.posx -= 64;
			}
			break;
		case TASTE.R: // allgemeiner Kamera-Reset, muss bei neuen Räumen angepasst werden
			if (this.posy < 576) {
				cam.setzeBounds(0, 0, 1088, 576);
			} else if (this.posy > 576) {
				cam.setzeBounds(0, 576, 1088, 576);
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
		for (int i = 0; i < 17; i++) { 			// Abfrage in x-Richtung
			for (int j = 0; j < 9; j++) {	 	// Abfrage in y-Richtung
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

				BILD b = new BILD(x, dy, sb.toString());
				if (deg != 0) {
					b.drehenUm(deg);
					deg = 0;
				}
				knoten.add(b);
				sb.delete(stddir.length(), sb.length());
				dy += 64;
			}
			dy = y;
			x += 64;
		}
	}
}