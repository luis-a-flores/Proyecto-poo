import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class MyWorld extends World
{
    public Lifes life;
    int x=2;
   
    public MyWorld()
    { 
        //    Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        // create new object
        Personaje n1 =new Personaje();
        // add object in world
        addObject(n1,50,300);
        //create other personajes
        crearMono(x);
        //
        life = new Lifes();
        
    }
    
    public void crearMono(int cant)
    {
        for(int i=0;i<cant;i++)
        {
            Mono m= new Mono();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(m,x,y);
        }
    }
}
