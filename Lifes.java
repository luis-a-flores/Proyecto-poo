import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifes extends Actor
{
    int lifes=3;
    
       
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Lifes()
    {
        
    }
    
    public void loseLife()
    {
        lifes -- ;
        if(lifes ==0)
        {
            Greenfoot.stop();
        }
    }
    
}
