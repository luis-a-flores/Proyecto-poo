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
    public void save(){
        Charset utf8 = StandardCharsets.UTF_8;
        String content = w.getScore() + ",";
        try(Writer writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("app.txt"), utf8)
        )){
            writer.write(content + "\n");
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
