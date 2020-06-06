import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

/**
 * Clase para leer archivo.
 */
public class ReadFile
{
    List<Record> lista = new ArrayList<>();
    /**
     * Lee el archivo.
     */
    public void leeArchivo() 
    {
        
        try (FileReader fr = new FileReader("Rtexto.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String linea = " ";

            while (((linea = br.readLine()) != null)) {
                Record record = new Record();
                String[] array = linea.split(",");
                record.setName(array[0]);
                record.setScore(Integer.parseInt(array[1].trim()));
                lista.add(record);
            }
            lista.sort(new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o2.getScore() - o1.getScore();
            }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No existe el archivo");
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("Excepcion 2");
        }
    } 
  
    /**
     * Regresa lista.
     */
    public List<Record> getList(){
        return lista;
        
    }
}
