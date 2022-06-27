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
	double posx = 1.5 * dimension, posy = 4.5 * dimension;
	// private int fx = (int) ((posx - 0.5 * dimension) / dimension), fy = (int)
	// ((posy - 0.5 * dimension) / dimension);
	// int fx = (int) ((posx / dimension) - 0.5), fy = (int) ((posy / dimension) -
	// 0.5);
	int fx = 1, fy = 4;
	// speichert feldtkoordinate des derzeitigen spielfeldes (1 feld = dimension *
	// dimension) der figur (beginnt bei 0)

	public Game(int width, int height) {
		super(width, height);
	}

	public Game() {
		super(17 * dimension, 9 * dimension);
		cam = new KAMERA();
		generation(R.room1, 0, 0);
		generation(R.room2, 0, (int) (9 * dimension));
		generation(R.room3, 0, (int) (18 * dimension));
		generation(R.room4, 0, (int) (27 * dimension));
		// n = new LoadBild((int)(1.5 * dimension), (int)(1.5 * dimension),
		// stddir.concat("/img/Figur.png"), dimension);
		n = new LoadBild((int) (dimension), (int) (4 * dimension), stddir.concat("/img/Figur.png"), dimension);
		// n.addCam(dimension);
		// posx = (1.5 * dimension);
		// posy = (1.5 * dimension);
		cam.setzeBounds(0, 0, 17 * dimension, 9 * dimension);
		// cam.setzeFokus(n.getB());

	}
	
	public void setzeBoundingRechteck(){
		
	}

	public int kollisionAbfragen(int[][] room, int x, int y) {
		int c;
		// for (int i = 0; i <= x; i++) {
		// for (int j = 0; j <= y; i++) {
		// switch (room[i][j]) {
		System.out.println(room[y][x]);
		for (int i = 0; i < room[0].length; i++) {
			for (int a = 0; a < room.length; a++) {
				System.out.print(room[a][i] + "     ");
			}
			System.out.println();
		}
		switch (room[y][x]) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 13:
		case 14:
		case 16:
			c = 0;
			break;
		/*
		 * case 9: n.bewegen(0, -128); c = false; break; case 10: n.bewegen(0, 128);
		 * cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension); //l o r u
		 * this.posy += 128;
		 * 
		 * this.fx = 8; this.fy = 1; c = false; break; case 11: n.bewegen(-128, 0); c =
		 * false; break; case 12: n.bewegen(128, 0); c = false; break;
		 */
		case 9:
		case 10:
		case 11:
		case 12:
			c = 2;
			break;
		default:
			c = 1;
			break;

		}
		return c; // returns 0 for true, 1 for false, 2 for doors
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
			if (kollisionAbfragen(R.room1, fx, fy - 1) == 1 // && this.posy < 9 * dimension
			// || kollisionAbfragen(R.room2, fx, fy - 1) == false && this.posy <= 18 *
			// dimension
			) {
				n.setzeDrehwinkel(0);
				n.bewegen(0, -dimension);
				this.posy -= dimension;
				this.fy -= 1;
			} else if (kollisionAbfragen(R.room1, fx, fy - 1) == 2) {
				n.bewegen(0, -192);
				cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension); //bounds müssen noch an räume angepasst werden
				this.posy -= 192;
				this.fx = 8;
				this.fy = 7;
			}
			break;
		case TASTE.LINKS:
		case TASTE.A:
			if (kollisionAbfragen(R.room1, fx - 1, fy) == 1) {
				n.setzeDrehwinkel(25);
				n.bewegen(-dimension, 0);
				this.posx += dimension;
				this.fx -= 1;
			} else if (kollisionAbfragen(R.room1, fx - 1, fy) == 2) {
				n.bewegen(-192, 0);
				cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension); //bounds müssen noch an räume angepasst werden
				this.posx -= 192;
				this.fx = 15;
				this.fy = 7;
			}
			break;
		case TASTE.UNTEN:
		case TASTE.S:
			n.setzeDrehwinkel(0);
			if (kollisionAbfragen(R.room1, fx, fy + 1) == 1) {
				n.bewegen(0, +dimension);
				this.posy += dimension;
				this.fy += 1;
			} else if (kollisionAbfragen(R.room1, fx, fy + 1) == 2) {
				n.bewegen(0, 192);
				cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension); // l o r u
				this.posy += 192;
				this.fx = 8;
				this.fy = 1;
			}
			/*
			 * if (this.posy + dimension == 8.5 * dimension && this.posx == 8.5 * dimension)
			 * { cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension);
			 * n.bewegen(0, 3 * dimension); this.posy += 3 * dimension; this.fy += 3; } else
			 * if (this.posy < 7 * dimension) { n.bewegen(0, +dimension); this.posy +=
			 * dimension; } else if (this.posy < 16 * dimension && this.posy >= 17 *
			 * dimension) { n.bewegen(0, +dimension); this.posy += dimension; }
			 */
			break;
		case TASTE.RECHTS:
		case TASTE.D:
			if (kollisionAbfragen(R.room1, fx + 1, fy) == 1) {
				n.setzeDrehwinkel(-25);
				n.bewegen(+dimension, 0);
				this.posx += dimension;
				this.fx += 1;
			} else if (kollisionAbfragen(R.room1, fx + 1, fy) == 2) {
				n.bewegen(+192, 0);
				cam.setzeBounds(0, 9 * dimension, 17 * dimension, 18 * dimension); //bounds müssen noch an räume angepasst werden
				this.posx += 192;
				this.fx = 1;
				this.fy = 4;
			}
			break;

		case TASTE.R: // allgemeiner Kamera-Reset, muss bei neuen Rï¿½umen angepasst werden
			if (this.posy < 9 * dimension) {
				cam.setzeBounds(0, 0, 17 * dimension, 9 * dimension);
			} else if (this.posy > 9 * dimension) {
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
					sb.append("/img/_DOOR_O.png");
					break;
				case R._DOOR_U:
					sb.append("/img/_DOOR_U.png");

					break;
				case R._DOOR_R:
					sb.append("/img/_DOOR_R.png");

					break;
				case R._DOOR_L:
					sb.append("/img/_DOOR_L.png");

					break;
				case R.TELEPORTER:
					sb.append("/img/Teleporter.png");
					break;
				case R.WASSER:
					sb.append("/img/WASSER.png");
					break;
				case R.GRASS:
					sb.append("/img/Grass.png");
					break;
				case R.KISTE:
					sb.append("/img/Kiste.png");
					break;
				case R.PLATTEGRAU:
					sb.append("/img/PLATTEGRAU.png");
					break;
				case R.PLATTEROT:
					sb.append("/img/PlatteRot.png");
					break;
				case R.PLATTEGRUEN:
					sb.append("/img/Grass.png");
					break;
				case R.PLATTEGELB:
					sb.append("/img/Grass.png");
					break;
				case R.PLATTEBLAU:
					sb.append("/img/PlatteBlau.png");
					break;
				case R.SCHLUESSEL:
					sb.append("/img/Schluessel.png");
					break;
				case R.SCHLUCHT:
					sb.append("/img/Boden.png"); // .png muss geupdated werden
					break;
				case R.HINDERNIS:
					sb.append("/img/Hindernis.png"); // .png muss geupdated werden
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