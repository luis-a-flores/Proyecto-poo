import greenfoot.*;  
/**
 * Clase que muestra Game Over.
 */
public class GameOver extends Actor
{
    
    private String userName;
    RecordsManager recordsManager = new RecordsManager();
    /**
     * Metodo para configurar imagen.
     */
    public GameOver()
    {
        setImage("game_over.jpg");
        
    }   
    public void work() 
    {
        
        Greenfoot.delay​(50);
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        recordsManager.saveRecord(userName, Nivel.score);
        Greenfoot.setWorld(new Credits());
    } 
}
