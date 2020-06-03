import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Write a description of class readFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class readFile extends Actor
{
    /**
     * Act - do whatever the readFile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        List<String> lista = new ArrayList<>();
        //drawCredits s = new drawCredits();
        try (FileReader fr = new FileReader("Rtexto.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String linea = " ";

            while (true) {
                try {
                    if (!((linea = br.readLine()) != null)) break;
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                lista.add(linea);
            }

            System.out.println("Cantidad de registros: " + lista.size() );
            Iterator iter = lista.iterator();
            while (iter.hasNext()){
                System.out.println(iter.next());
                //s.act("ola");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        
    } 
}
