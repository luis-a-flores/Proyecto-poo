
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Personaje extends Actor
{
    public static final int up=0;
    public static final int down=1;
    public static final int left=2;
    public static final int right=3;
    int shot=2;
    boolean isShot=false;
    boolean isPower=false;
    
    public Personaje()
    {
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setDirection(up);
            shot=0;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setDirection(down);
            shot=1;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setDirection(left);
            shot=3;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setDirection(right);
            shot=2;
        }
        setShot(shot);
    }    
    
    public void setDirection(int direction)
    {
        switch(direction)
        {
            case up:
                setRotation(270);
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(),getY()-10);
                }
                else
                {
                    setLocation(getX(),getY()-1);
                }
            break;
            
            case down:
                setRotation(90);
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(),getY()+10);
                }
                else
                {
                    setLocation(getX(),getY()+1);
                }
            break;
            
            case left:
                setRotation(180);
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX()-10,getY());
                }
                else
                {
                    setLocation(getX()-1,getY());
                }
            break;
            
            case right:
                setRotation(0);
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX()+10,getY());
                }
                else
                {
                    setLocation(getX()+1,getY());
                }
        }
    }
    
    public void setShot(int direction)
    {
        if(Greenfoot.isKeyDown("s") && isShot)
        {
            MyWorld w=(MyWorld)getWorld();
            if(w.puntos.obtenerValor()>=0)
            {
                Disparo d1= new Disparo(direction);
                getWorld().addObject(d1,getX(),getY());
                isShot=false;
                
            }
        }
        if(!isShot || !Greenfoot.isKeyDown("s"))
        {
            isShot=true;
        }
        if(isPower && Greenfoot.isKeyDown("c"))
        {
            MyWorld w=(MyWorld)getWorld();
            if(w.power.obtenerValor()>0)
            {
                Power sp1=new Power(direction);
                getWorld().addObject(sp1,getX(),getY());
                isPower=false;
                w.power.decrementar();
            }
        }
        if(!isPower && !Greenfoot.isKeyDown("c"))
        {
            isPower=true;
        }
    }
}


