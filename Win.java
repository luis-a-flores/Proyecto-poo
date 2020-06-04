import greenfoot.*; 


public class Win extends Actor
{
    private String userName;
    saveFile sv = new saveFile();
    public Win()
    {
        setImage("Win.png");
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
        Greenfoot.setWorld(new Credits());
        
    } 
}
