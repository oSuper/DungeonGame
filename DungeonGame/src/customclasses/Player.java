package customclasses;

import stdclasses.FIGUR;
import stdclasses.TASTE;

public class Player extends FIGUR
{
    private static final long serialVersionUID = 1L;
	
    //private String Key = "Figur.png";
    public Player(int posx, int posy, String datei)
    {
        super(posx, posy, datei);
    }
    public void tasteReagieren(int code)
    {
        switch(code)
        {
            case TASTE.OBEN:   
            	super.verschiebenUm(+0, -16);
            	break;
            
            case TASTE.RECHTS: 
            	super.verschiebenUm(+16, +0);
            	break;
            
            case TASTE.UNTEN:
            	super.verschiebenUm(+0, +16);
            	break;
            
            case TASTE.LINKS:
            	super.verschiebenUm(-16, +0);
            	break;
        }
    }   
    /*
    private String gebeSchluessel(){
        return Key;
    }
    */
}