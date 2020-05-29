import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    int speed=5;
    int direction;
    
    
    public Disparo(int direction)
    {
        this.direction=direction;
    }
    
    
    public void act() 
    {
        switch(direction)
        {
            case 0:
                setLocation(getX(),getY()-speed);
            break;
            case 1:
                setLocation(getX(),getY()+speed);
            break;
            case 2:
                setLocation(getX()+speed,getY());
            break;
            case 3:
                setLocation(getX()-speed,getY());
            break;
        }
        Actor Mono=getOneObjectAtOffset(0,0,Mono.class);
        if(Mono!=null)
        {
            MyWorld w=(MyWorld)getWorld();
            getWorld().removeObject(Mono);            
        }
        
        
        if((getX() >= getWorld().getWidth()-3) || (getX()<=3))
        {
            getWorld().removeObject(this);
        }else
        {
        if((getY() >= getWorld().getWidth()-3) || (getY()<=3))
        {
            getWorld().removeObject(this);
        }
        }
    }    
}
