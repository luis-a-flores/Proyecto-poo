import greenfoot.*;  
import java.util.*;
/**
 * Escenario numero 2 del juego
 */
public class Level2 extends Nivel
{
    private int verifyLevel3 = 12;
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
        if(Nivel.score == verifyLevel3){
            Greenfoot.setWorld(new Level3());
        }
    }
}
