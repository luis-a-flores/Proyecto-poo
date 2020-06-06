import greenfoot.*; 
import java.io.*;
import java.nio.*;
import java.util.*;
/**
 * Clase para guardar archivo.
 */
public class RecordsManager 
{

    /**
     * Clase para escribir en archivo.
     */
    public void saveRecord(String userName, int score){
        List<Record> lista =getRecords();
        Record record1 = new Record(userName,score);
        lista.add(record1);
        sorted(lista);
        int cont=0;
        Iterator<Record> it =lista.iterator();
        String cadena = Integer.toString(score);
        try{
            File archivo = new File("Rtexto.txt");

            FileWriter escribir = new FileWriter(archivo, false);
            while(cont!=10 && it.hasNext())
            {
                Record record = it.next();
                escribir.write(record.getName());
                escribir.write(",");
                escribir.write(record.getScore()+"");
                escribir.write("\r\n");
                cont++;
            }
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir");
        }
    }

    public List<Record> getRecords() 
    {
        List<Record> lista = new ArrayList<>();

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
            sorted(lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No existe el archivo");
        } catch (
        IOException e) {
            e.printStackTrace();
            System.out.println("Excepcion 2");
        }
        return lista;
    } 

    public void sorted(List<Record> lista)
    {
        lista.sort(new Comparator<Record>() {
                @Override
                public int compare(Record o1, Record o2) {
                    return o2.getScore() - o1.getScore();
                }
            });
    }
}
