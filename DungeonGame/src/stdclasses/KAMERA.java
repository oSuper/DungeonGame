package stdclasses;
import ea.edu.FensterE;
import ea.Kamera;
import ea.BoundingRechteck;
import ea.Raum;
import ea.Vektor;

/**
 * Klasse KAMERA liefert von der unendlich grossen Zeichenebene einen rechteckigen Ausschnitt. 
 * Dieser kann im (viel groesseren) Spielfeld verschoben werden wie der Aufnahmebereiche einer 
 * schwenkenden Kamera. Man sieht also immer nur einen begrenzten rechteckigen Ausschnitt der Welt.
 * 
 * @author      mike ganshorn
 * 
 * @version     v1.0 (2017-04-12)
 */
public class KAMERA
{
    private Kamera kamera;

    
    /**
     * Konstruktor der Klasse KAMERA
     */
    public KAMERA()
    {
        this.kamera = FensterE.getFenster().cam;
    }

    
    /**
     * Setzt die Grenzen (in Pixeln) ueber welche die Kamera nicht hinaus laufen kann.
     *
     * @param   links   Linke Pixel-Grenze
     * 
     * @param   oben    Obere Pixel-Grenze
     * 
     * @param   rechts  Rechte Pixel-Grenze
     * 
     * @param   unten   Untere Pixel-Grenze
     */
    public void setzeBounds( int links , int oben , int rechts , int unten )
    {
        this.kamera.boundsSetzen( new BoundingRechteck(links,oben,rechts,unten) );
    }
    
    
    /**
     * Nimmt den Fokus der Kamera vom aktuellen Objekt. 
     *
     */
    public void loescheFokus()
    {
        this.kamera.fokusLoeschen();
    }
    
    
    /**
     * Setzt den Fokus der Kamera auf ein bestimmtes Objekt. 
     *
     * @param   r   Das zu fokussierende Objekt
     */
    public void setzeFokus( Raum r )
    {
        this.kamera.fokusSetzen(r);
    }
    
    
    /**
     * Nimmt das fokussierte Objekt aus dem exakten Zentrum der Kamera. 
     *
     * @param   x_verzug    negative Werte verschieben das Objekt in der Kamera nach links,
     *                      positive Werte verschieben das Objekt in der Kamera nach rechts
     * 
     * @param   y_verzug    negative Werte verschieben das Objekt in der Kamera nach oben,
     *                      positive Werte verschieben das Objekt in der Kamera nach unten
     */
    public void setzeFokusVerzug( int x_verzug , int y_verzug )
    {
        this.kamera.fokusVerzugSetzen( new Vektor(x_verzug,y_verzug) );
    }
    
    
    /**
     * Setzt das Zentrum der Kamera auf einen bestimmten Punkt (in Pixeln).
     *
     * @param   x   x-Koordinate des Kamera-Fokus
     * 
     * @param   y   y-Koordinate des Kamera-Fokus
     */
    public void setzeZentrum( int x , int y )
    {
        this.kamera.zentrumSetzen( x , y );
    }
    
    
    /**
     * Verschiebt den Kamera-Fokus um eine bestimmte Strecke
     *
     * @param   deltaX  negative Werte verschieben nach links, 
     *                  positive Werte verschieben nach rechts
     * 
     * @param   deltaY  negative Werte verschieben nach oben, 
     *                  positive Werte verschieben nach unten
     */
    public void verschieben( int deltaX , int deltaY )
    {
        this.kamera.verschieben( deltaX , deltaY );
    }
    
}
