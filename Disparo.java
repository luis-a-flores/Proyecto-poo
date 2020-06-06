import greenfoot.*;  
import java.util.*;
/**
 * Clase para manejar el disparo.
 */
public class Disparo extends Actor
{
    private int speed = 5;
    private int direction;
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
        existenciaMono();
        eliminaObjeto();
    }
    /**
     * Verifica exiistencia enemigo.
     */
    public void existenciaMono(){
        Actor Mono = getOneObjectAtOffset(0,0,Mono.class);
        if(Mono!=null)
        {
            Nivel actualWorld = (Nivel)getWorld();
            getWorld().removeObject(Mono);
            actualWorld.puntos.incrementar();
            actualWorld.score++;
        }
    }
    /**
     * Quita objeto de escenario.
     */
    public void eliminaObjeto(){
        int limiteDerecho = getWorld().getWidth()-3;
        int limiteIzquierdo = 3;
        int limiteArriba = getWorld().getHeight()-3;
        int limiteAbajo = 3;
        if((getX() >= limiteDerecho) || (getX())<=limiteIzquierdo)
        {
            getWorld().removeObject(this);
        }else
        {
            if((getY() >= limiteArriba) || (getY()<=limiteAbajo))
            {
                getWorld().removeObject(this);
            }
        }
    }
}
