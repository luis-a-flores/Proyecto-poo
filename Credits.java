import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * Clase para mostrar creditos en pantalla.
 */
public class Credits extends World
{
    private RecordsManager recordsManager = new RecordsManager(); 

    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //

        prepare();
    }

    /**
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

        }
        Greenfoot.stop();
    }
}
