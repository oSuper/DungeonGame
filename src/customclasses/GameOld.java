//alte Klasse mit der alten Room-Generation
package customclasses;

import stdclasses.BILD;
import stdclasses.FIGUR;
import stdclasses.KAMERA;
import stdclasses.SPIEL;
import stdclasses.TASTE;

public class GameOld extends SPIEL {
	// Knoten knoten = new Knoten();
	int xRoom = 1;
	int yRoom = 1;
	Dungeon Dungeon;
	KAMERA cam;
	private int k = 32;
	FIGUR player;
	private String stddir = "./DungeonGame";
	private BILD n;
	private int posx = 96, posy = 96;

	public GameOld() {

		super(1088, 576);
		cam = new KAMERA();

		for (int x = 2; x <= 16; x++) {
			for (int y = 2; y <= 8; y++) {
				new BILD(((2 * x - 1) * k), ((2 * y - 1) * k), stddir.concat("/img/Boden.png"));

				/*
				 * try { Thread.sleep(5); } catch (InterruptedException ie) {
				 * ie.printStackTrace(); }
				 */

			}

		}
		new BILD(32, 32, stddir.concat("/img/EckeObenLinks.png"));
		new BILD(32, 544, stddir.concat("/img/EckeUntenLinks.png"));
		for (int i = 2; i <= 16; i++) {
			new BILD(((2 * i - 1) * k), k, stddir.concat("/img/WandOben.png"));

			new BILD(((2 * i - 1) * k), 9 * k * 2 - k, stddir.concat("/img/WandUnten.png"));

		}
		new BILD(1056, 32, stddir.concat("/img/EckeObenRechts.png"));
		new BILD(1056, 544, stddir.concat("/img/EckeUntenRechts.png"));
		for (int i = 2; i <= 8; i++) {
			new BILD(k, ((2 * i - 1) * k), stddir.concat("/img/WandLinks.png"));
			new BILD(17 * k * 2 - k, ((2 * i - 1) * k), stddir.concat("/img/WandRechts.png"));

		}
		new BILD(544, 32, stddir.concat("/img/DoorTop.png"));
		n = new BILD(96, 96, stddir.concat("/img/Figur.png"));
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException ie) {
		 * ie.printStackTrace(); } n.bewegen(0, 128);
		 */

		cam.setzeBounds(0, 0, 5120, 2880);

	}

	@Override
	public void tasteReagieren(int code) {
		switch (code) {
		case TASTE.OBEN:
		case TASTE.W:
			n.bewegen(0, -64);
			this.posy -= 64;
			break;
		case TASTE.RECHTS:
		case TASTE.D:
			n.bewegen(+64, 0);
			this.posx += 64;
			break;
		case TASTE.UNTEN:
		case TASTE.S:
			n.bewegen(0, +64);
			this.posy += 64;
			break;
		case TASTE.LINKS:
		case TASTE.A:
			n.bewegen(-64, 0);
			this.posx -= 64;
			break;
		default:
			System.out.println("Falsche Taste!");
			break;
		}
	}
	public int returnX() {
		return this.posx;
	}
	public int returnY() {
		return this.posy;
	}
}
