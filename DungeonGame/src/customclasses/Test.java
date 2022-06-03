package customclasses;

import stdclasses.BILD;
import stdclasses.KAMERA;
import stdclasses.SPIEL;

public class Test extends SPIEL
{
	BILD Bild;
	KAMERA cam;
	@SuppressWarnings("unused")
	public Test()
	{
		super(1000, 1000);
		this.cam.setzeBounds(0, 0, 1024, 576);
		int k = 8;
		for(int x = 2; x<=15;x++)
		{
			for(int y = 2; y<= 8; y++)
			{
				BILD n = new BILD(((2*x-1)*k),((2*y-1)*k), "Boden.png");
			}
		}
		for(int i = 1; i<=16;i++)
		{
			BILD n = new BILD(((2*i-1)*k), k, "WandOben.png");
			BILD m = new BILD(((2*i-1)*k), 9*k*2-k, "WandUnten.png");
		}
		for(int i = 1; i<= 9; i++)
		{
			BILD n = new BILD(k, ((2*i-1)*k), "WandLinks.png");
			BILD m = new BILD(16*k*2-k, ((2*i-1)*k), "WandRechts.png");
		}
	}
}
