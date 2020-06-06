import greenfoot.*;  
/**
 * Clase que muestra Game Over.
 */
public class GameOver extends Actor
{
<<<<<<< HEAD
    
    private String userName;
    RecordsManager recordsManager = new RecordsManager();
=======
    private String userName;
    saveFile sv = new saveFile();
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
    /**
     * Metodo para configurar imagen.
     */
    public GameOver()
    {
        setImage("game_over.jpg");
<<<<<<< HEAD
        
    }   
    public void work() 
    {
        
        Greenfoot.delay​(50);
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        recordsManager.saveRecord(userName, Nivel.score);
=======
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
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
        Greenfoot.setWorld(new Credits());
    } 
}
