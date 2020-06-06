import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Clase de Diablito, personaje principal.
 */
public class Personaje extends Actor
{
    public static final int up = 0;
    public static final int down = 1;
    public static final int left = 2;
    public static final int right = 3;
    
    private int shot = 2;
    
    private boolean isShot=false;
    /**
     * Funcion constructor.
     */
    public Personaje()
    {
        setImage("diablito.png");
    }
    
    /**
     * Funcion para control de personaje con teclas.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            if(getY() > 100){
                setDirection(up); // Cambia direccion de Diablito.
                shot=0;
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            if(getY() < 530){
                setDirection(down); 
                shot=1;
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            if(getX() < 750){
                setDirection(right);
                shot=2;
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if(getX() > 50){
                setDirection(left); 
                shot=3;
            }
        }
        setShot(shot);
    }    
     
    /**
     * Funcion para mover al personaje.
     */
    public void setDirection(int direction)
    {
        switch(direction)
        {
            case up: 
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(),getY()-10);
                }else
                {
                    setLocation(getX(),getY()-1);
                }
            break;
            case down: 
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(),getY()+10);
                }else
                {
                    setLocation(getX(),getY()+1);
                }
            break;
            case right: 
                setImage("diablito.png");
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX()+10,getY());
                }else
                {
                    setLocation(getX()+1,getY());
                }
            break;
            case left: 
                setImage("diablito2.png");
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX()-10,getY());
                }else
                {
                    setLocation(getX()-1,getY());
                }
            break;
        }
    }
    /**
     * Funcion para disparar.
     */
    public void setShot(int direction)
    {
        if(Greenfoot.isKeyDown("s")&& isShot)
        {
            Disparo d1= new Disparo(direction); // Dispara.
            getWorld().addObject(d1,getX(),getY());
            isShot=false;
        }
        if(!isShot || !Greenfoot.isKeyDown("s"))
        {
            isShot=true;
        }
    }
}


