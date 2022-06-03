package customclasses;

import java.awt.image.BufferedImage;

import java.awt.*;
import ea.internal.io.ImageLoader;
import stdclasses.bildN;

public class LoadBild
{
	private BufferedImage img;
	private bildN b;
	
	public LoadBild(int x, int y, String name, int dimension)
    {
        img = ImageLoader.loadExternalImage(name);
        img = resize(img, dimension, dimension);
        b = new bildN(img, x, y);
    }
	public static BufferedImage resize (BufferedImage img, int width, int height)
	{
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsConfiguration gc = env.getDefaultScreenDevice().getDefaultConfiguration();

		BufferedImage resize = gc.createCompatibleImage(width, height, img.getTransparency());
		Graphics2D g = resize.createGraphics();

		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(img, 0, 0, width, height, 0, 0, img.getWidth(), img.getHeight(), null);
		g.dispose();

		return resize;
	}
	public void drehenUm(float deg)
	{
		b.drehenUm(deg);
	}
	public void setzeDrehwinkel(float neuerDrehwinkel)
    {
        b.drehenAbsolut( -neuerDrehwinkel );
    }
	public void bewegen (float dX, float dY) {
		b.bewegen(dX, dY);
	}
	public void addCam(int dimension)
	{
		b.addCam(dimension);
	}
	public bildN getB()
	{
		return b;
	}
}
