import greenfoot.*;  
/**
 * Clase que muestra Game Over.
 */
public class GameOver extends Actor
{
    /**
     * Metodo para configurar imagen.
     */
    public GameOver()
    {
        setImage("game_over.jpg");
        Nivel.score = 0;
        Nivel.life = 3;
        Greenfoot.stop();
    }   
}
