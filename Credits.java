import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends World
{
    readFile f = new readFile();
    String var;
    
    List <String> lista;
   
    
    
    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        f.act();
        lista = f.getList();
        
       
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        int creditPositionY = 75;
        
        
        
        
        for(int i = 0; i < 10; i ++){
           
            creditPositionY += 25;
            showText(lista.get(i), 100, creditPositionY);
           
        }
        Greenfoot.stop();
    }
}
