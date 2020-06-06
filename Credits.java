import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
<<<<<<< HEAD
import java.util.*;
/**
 * Clase para mostrar creditos en pantalla.
 */
public class Credits extends World
{
    private RecordsManager recordsManager = new RecordsManager(); 

=======
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
   
    
    
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
<<<<<<< HEAD
        //

=======
        f.act();
        lista = f.getList();
        
       
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
        prepare();
    }

    /**
<<<<<<< HEAD
     * Metodo que prepara al mundo.
     */
    private void prepare()
    {
        List<Record> lista = recordsManager.getRecords();
        int creditPositionY = 75;
        Iterator<Record> it= lista.iterator();
        //System.out.println(lista.get(0).getName());
        for(int i = 0; i < 10 && it.hasNext(); i ++){
            Record record =it.next();
            creditPositionY += 25;
            
            showText(record.getName()+record.getScore(),100, creditPositionY);

=======
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        int creditPositionY = 75;
        
        
        
        
        for(int i = 0; i < 10; i ++){
           
            creditPositionY += 25;
            showText(lista.get(i), 100, creditPositionY);
           
>>>>>>> 0769eb02839f2dd5de87b761a990e8e097c19a4a
        }
        Greenfoot.stop();
    }
}
