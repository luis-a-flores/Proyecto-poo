import greenfoot.*;  
import java.util.*;
/**
 * Clase para manejar el disparo.
 */
public class Disparo extends Actor
{
    private int speed = 5;// Variable para la velocidad.
    private int direction;// Variable para la direccion.
    /**
     * Metodo Constructor De Disparo
     */
    public Disparo(int direction)
    {
        this.direction=direction;
    }
    /**
     * Metodo para dirigir el disparo.
     */
    public void act() 
    {
        // Funcion que cambia la direccion
        switch(direction)
        {
            case 0:
                setLocation(getX(),getY()-speed); // Arr
            break;
            case 1:
                setLocation(getX() ,getY()+speed -2); // Ab
            break;
            case 2:
                setLocation(getX()+speed,getY()); // Der
            break;
            case 3:
                setLocation(getX()-speed,getY()); // Izq
            break;
        }
        Actor Mono = getOneObjectAtOffset(0,0,Mono.class);
        // Verifica si existe Mono.
        if(Mono!=null)
        {
            Nivel w = (Nivel)getWorld();
            getWorld().removeObject(Mono);
            w.puntos.incrementar();
            w.score++;
        }
        // Elimina el objeto del escenario
        if((getX() >= getWorld().getWidth()-3) || (getX()<=3))
        {
            getWorld().removeObject(this);
        }else
        {
            if((getY() >= getWorld().getHeight()-3) || (getY()<=3))
            {
                getWorld().removeObject(this);
            }
        }
    }    
}
