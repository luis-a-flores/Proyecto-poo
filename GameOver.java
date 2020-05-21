import greenfoot.*;  



public class GameOver extends Actor
{
    GreenfootImage imagen;
    String mensaje;
    
    public GameOver()
    {
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("verdana",34));
        imagen.drawString("game Over",0,30);
        setImage(imagen);
        Greenfoot.stop();
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
