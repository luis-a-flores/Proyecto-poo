import greenfoot.*;  
/**
 * Clase que muestra Game Over.
 */
public class GameOver extends Actor
{
    private String userName;
    saveFile sv = new saveFile();
    /**
     * Metodo para configurar imagen.
     */
    public GameOver()
    {
        setImage("game_over.jpg");
        Nivel.score = 0;
        Nivel.life = 3;
    }   
    public void act() 
    {
        // Add your action code here.
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        sv.manejaArchivo(userName);
        Greenfoot.stop();
    } 
}
