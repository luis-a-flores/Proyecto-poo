import greenfoot.*;  
import java.util.*;
/**
 * Escenario numero 3 del juego
 */
public class Level3 extends Nivel
{
    /**
     * Constructor del nivel.
     */
    public Level3()
    { 
    }
    /**
     * Metodo para colocar win.
     */
    public void act(){
        if(Nivel.score == 22){
           Win ws = new Win();
           addObject(ws,getWidth()/2,getHeight()/2);
        }
    }
}