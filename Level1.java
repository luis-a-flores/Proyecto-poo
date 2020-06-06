import greenfoot.*;  
import java.util.*;

/**
 * Escenario numero 1 del juego
 */
public class Level1 extends Nivel
{
    private int verifyLevel2 = 5;
    /**
     * Constructor del nivel.
     */
    public Level1()
    {  
    }
    /**
     * Metodo para ir al siguiente nivel.
     */
    public void act(){
       if(Nivel.score == verifyLevel2){
           Greenfoot.setWorld(new Level2());
       }
    }
}
