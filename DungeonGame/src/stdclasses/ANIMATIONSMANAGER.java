//import ea.edu.FensterE;
package stdclasses;
import ea.AnimationsManager;
import ea.Raum;
import ea.Punkt;

/**
 * Klasse ANIMATIONSMANAGER stellt Methoden zur Verfuegung, mit denen man jedes 
 * Grafik-Objekt animieren kann. 
 * 
 * <b>Er darf erst erzeugt werden, nachdem ein Grafik-Fenster existiert.<b> 
 * Das ist der Fall, wenn vorher entweder das Fenster selbst oder ein 
 * beliebiges Grafik-Objekt erzeugt wurde.
 * 
 * @author      mike ganshorn
 * @version     1.0 (2015-12-01)
 */
public class ANIMATIONSMANAGER
{
    private static AnimationsManager am;
    
    /**
     * Konstruktor der Klasse ANIMATIONSMANAGER
     */
    public ANIMATIONSMANAGER()
    {
        //this.am = FensterE.getFenster().animationsManager.getAnimationsManager();
        am = AnimationsManager.getAnimationsManager();
    }
    
    /**
     * Laesst ein Objekt im Kreis um einen Punkt laufen. 
     * Der Radius ergibt sich dabei aus dem Mittelpunkt des Objekts und dem Punkt.
     *
     * @param   r   Das zu animierende Grafik-Objekt
     * 
     * @param   x   x-Koordinate des Animations-Mittelpunkts
     * 
     * @param   y   y-Koordinate des Animations-Mittelpunkts
     * 
     * @param   t   Umlaufzeit in Millisekunden
     */
    public void kreisAnimation( Raum r , int x , int y , int t , boolean imUhrzeigerSinn )
    {
        am.kreisAnimation( r , new Punkt(x,y) , true , t , imUhrzeigerSinn );
    }
    
    /**
     * Bewegt ein Objekt laengs einer (Halb)Geraden.  
     * Bewegung erfolgt vom Mittelpunkt des Objekts hin zum uebergebenen Punkt. 
     * Der Punkt gibt nur die Richtung vor, die Entfernung kann über das Verhaeltnis 
     * von animationsZeit und zielZeit variiert werden.
     *
     * @param   r               Das zu animierende Grafik-Objekt
     * 
     * @param   x               x-Koordinate des Punkts, auf den sich das Grafik-Objekt zu bewegen soll
     * 
     * @param   y               y-Koordinate des Punkts, auf den sich das Grafik-Objekt zu bewegen soll
     * 
     * @param   zielZeit        Die Zeit in Millisekunden, bis der Ziel-Punkt erreicht ist
     * 
     * @param   animationsZeit  Die Zeitin Millisekunden, bis die Animation beendet wird
     */
    public void streckenAnimation( Raum r , int x , int y , int zielZeit )
    {
        am.geradenAnimation( r , new Punkt(x,y) , zielZeit , zielZeit );
    }
    
    /**
     * Bewegt ein Objekt zwischen seinem aktuellen Mittelpunkt und einem anderen Punkt fortwaehrend hin und her.
     *
     * @param   r                Das zu animierende Grafik-Objekt.
     *  
     * @param   x               x-Koordinate des Ziel-Punkts
     * 
     * @param   y               y-Koordinate des Ziel-Punkts
     * 
     * @param   streckenDauer   Die Zeit in Millisekunden, bis alle "Etappen"-Punkte einmal abgegangen wurden.
     */
    public void patrouillenAnimation( Raum r , int x, int y , int streckenDauer )
    {
        am.streckenAnimation( r , streckenDauer , new ea.Punkt(x,y) );
    }
    
    /**
     * Bewegt ein Objekt von seinem aktuellen Mittelpunkt ueber beliebig viele Punkte fortwaehrend hin und her.
     *
     * @param   r           Das zu animierende Grafik-Objekt.
     * 
     * @param   laufDauer   Die Zeit in Millisekunden, bis alle "Etappen"-Punkte einmal abgegangen wurden.
     * 
     * @param   punkte      Beliebige Anzahl von Punkt-Objekten (durch Komma getrennt).
     *                      Der erste Punkt ist automatisch immer der urspruengliche Mittelpunkt des Grafik-Objekts. Dieser Punkt darf NICHT mit genannt werden!
     *                      Punkte mit <code>new ea.Punkt(x-Koordinate, y-Koordinate)</code> erzeugen.
     */
    public void patrouillenAnimation( Raum r , int laufDauer , Punkt... punkte )
    {
        am.streckenAnimation( r , laufDauer , punkte );
    }
    
    /**
     * Methode animationBeendenVon
     *
     * @param   r   Das Grafik-Objekt, dessen Animation gestoppt werden soll
     */
    public void animationBeendenVon( Raum r )
    {
        am.animationBeendenVon( r );
    }
}
