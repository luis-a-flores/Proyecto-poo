import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class MyWorld extends World
{
    public Lifes life;
    int x=5;
    Cadenas puntos;
    Cadenas vidas;
    Cadenas power;
   
    public MyWorld()
    { 
        //    Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        //orden para que se vallan añadiendo
        setPaintOrder(GameOver.class,Cadenas.class,Mono.class,Personaje.class);
        // create new object
        Personaje n1 =new Personaje();
        // add object in world
        addObject(n1,50,300);
        //create other personajes
        crearMono(x);
        //
        life = new Lifes();
        //
        puntos= new Cadenas(0,"puntuacion");
        //
        vidas= new Cadenas(3,"vidas");
        //
        power=new Cadenas(0,"Powel");
        //
        addObject(puntos,150,85);
        //
        addObject(vidas, 400, 85);
        //
        addObject(power,500,85);
        //
        crearPower(1);
        
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
    
    public void crearPower(int numero)
    {
        int i;
        for(i=0;i<numero;i++)
        {
            SpPower p= new SpPower();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            int powel=Greenfoot.getRandomNumber(5);
            if(powel==4)
                addObject(p,x,y);
        }
    }
}