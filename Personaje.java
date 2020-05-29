import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Clase de Diablito, personaje principal.
 */
public class Personaje extends Actor
{
    // Variables de movimiento
    public static final int up = 0;
    public static final int down = 1;
    public static final int left = 2;
    public static final int right = 3;
    // Variable disparo direccion
    private int shot = 2;
    // Verifican si a disparado
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
        // Verifica si tecla a sido presionada.
        if(Greenfoot.isKeyDown("up"))
        {
            if(getY() > 100){
                setDirection(up); // Cambia direccion de Diablito.
                shot=0;
            }
        }
        // Verifica si tecla a sido presionada.
        if(Greenfoot.isKeyDown("down"))
        {
            if(getY() < 530){
                setDirection(down); // Cambia Direccion de Diablito.
                shot=1;
            }
        }
        // Verifica si tecla a sido presionada.
        if(Greenfoot.isKeyDown("right"))
        {
            if(getX() < 750){
                setDirection(right); // Cambia direccion de Diablito.
                shot=2;
            }
        }
        // Verifica si tecla a sido presionada.
        if(Greenfoot.isKeyDown("left"))
        {
            if(getX() > 50){
                setDirection(left); // Cambia direccion de Diablito.
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
            case up: // Flecha hacia arriba.
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(),getY()-10);
                }else
                {
                    setLocation(getX(),getY()-1);
                }
            break;
            case down: // Flecha hacia abajo.
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(),getY()+10);
                }else
                {
                    setLocation(getX(),getY()+1);
                }
            break;
            case right: // Flecha hacia la derecha.
                setImage("diablito.png");
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX()+10,getY());
                }else
                {
                    setLocation(getX()+1,getY());
                }
            break;
            case left: // Flecha hacia la izquierda.
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
        // Verifica si S a sido presionada.
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


