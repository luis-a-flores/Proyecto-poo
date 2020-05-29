import greenfoot.*;  
import java.util.*;
/**
 * Escenario numero 2 del juego
 */
public class Level2 extends Nivel
{
    /**
     * Constructor del nivel.
     */
    public Level2()
    { 
    }
    /**
     * Metodo para ir al siguiente nivel.
     */
    public void act(){
        if(Nivel.score == 12){
            Greenfoot.setWorld(new Level3());
        }
    }
}
