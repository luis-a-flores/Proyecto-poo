import greenfoot.*; 
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * Clase para guardar archivo.
 */
public class saveFile extends Actor
{
    Nivel w = (Nivel)getWorld();
    // Creamos la variable
    //Formatter archivo = null;
    private String userName;
    private int h = w.score;
    
    public void manejaArchivo(String userName){

        String cadena = Integer.toString(h);

        try{
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo.
            File archivo = new File("C:\\Users\\agust\\IdeaProjects\\Proyecto-poo2\\archivoScore\\Rtexto.txt");

            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(userName);
            escribir.write(" ");
            escribir.write(cadena);
            
            escribir.write("\r\n");
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir");
        }
    }

}
