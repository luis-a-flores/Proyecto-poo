import greenfoot.*; 


public class Win extends Actor
{
    saveFile sv = new saveFile();
    public Win()
    {
        setImage("Win.png");
        Nivel.score = 0;
        Nivel.life = 3;
        //sv.act3();
        Greenfoot.stop();
    }
    public void act() 
    {
        // Add your action code here.
    } 
}
