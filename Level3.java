import greenfoot.*;  
import java.util.*;
/**
 * Escenario numero 3 del juego
 */
public class Level3 extends Nivel
{
    private int verifyWin = 22;
    private int setWidthWin = getWidth() / 2;
    private int setHeightWin = getHeight() / 2;
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
        if(Nivel.score == verifyWin){
           Win screenWin = new Win();
           screenWin.work();
           addObject(screenWin, setWidthWin, setHeightWin);
        }
    }
}