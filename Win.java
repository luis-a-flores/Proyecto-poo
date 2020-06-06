import greenfoot.*; 

/**
 * Clase para mostrar Creditos
 */
public class Win extends Actor
{
    private String userName;
<<<<<<< HEAD
    RecordsManager recordsManager = new RecordsManager();
    /**
     * Constructor.
     */
=======
    saveFile sv = new saveFile();
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
    public Win()
    {
        setImage("Win.png");
        Nivel.score = 0;
        Nivel.life = 3;
<<<<<<< HEAD
=======
       
        
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
    }
    /**
     * Guarda archivo.
     */
    public void work() 
    {
<<<<<<< HEAD
        Greenfoot.delay​(50);
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        recordsManager.saveRecord(userName, Nivel.score);
        Greenfoot.setWorld(new Credits());
=======
        // Add your action code here.
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        sv.manejaArchivo(userName);
        Greenfoot.setWorld(new Credits());
        
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
    } 
}
