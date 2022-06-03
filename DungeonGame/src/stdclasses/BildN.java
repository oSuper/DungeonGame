package stdclasses;

import ea.Bild;
import ea.Vektor;
import ea.edu.*;
import ea.internal.phy.NullClient;
import ea.internal.phy.PhysikClient;

import java.awt.image.BufferedImage;

public class BildN extends Bild
{
	private PhysikClient phClient = new NullClient(this);
	private static final long serialVersionUID = 1L;
	private KAMERA k;

	public BildN(BufferedImage img, int x, int y)
    {
        super(x, y, img);
        FensterE.getFenster().wurzel.add(this);
    }
	public void drehenUm( float winkelAenderung )
    {
        this.drehenRelativ( -winkelAenderung );
    }
	public void setzeDrehwinkel(float neuerDrehwinkel)
    {
        this.drehenAbsolut( -neuerDrehwinkel );
    }
	public void bewegen (float dX, float dY) 
	{
		phClient.bewegen(new Vektor(dX, dY));
	}
	public void addCam(int dimension)
	{
		k = new KAMERA();
		k.setzeBounds(0, 0, 10 * dimension, 5 * dimension);
	}
}
