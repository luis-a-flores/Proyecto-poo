import greenfoot.*;  
/**
 * Clase para dibujar texto en el mundo.
 */
public class Cadenas extends Actor
{
    private GreenfootImage imagen; // Variable para imagen
    private int valorVariable; // Variable contiene el valor de life o score
    private String mensaje;
    
     /**
     * This method draws the 
     * 
     * @param valorVariable 
     * @param mensaje que recibe 
     * nombre de la cadena
     * @return 
     */
    public Cadenas(int valorVariable, String mensaje)
    {
        this.valorVariable = valorVariable; // Asigna el valor inicial 
        this.mensaje = mensaje; // Asigna el nombre de la variable 
        
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("verdana",24));
        dibuja();
    }
    /**
     * Metodo que coloca las palabras en el mundo.
     */
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje + valorVariable, 20, 20);
        setImage(imagen);
    }
    /**
     * Metodo para incrementar score.
     */
    public void incrementar()
    {
        valorVariable ++;
        dibuja();
    }
    /**
     * Metodo para decrementar life.
     */
    public void decrementar()
    {
        valorVariable --;
        dibuja();
    }
    /**
     * Metodo para obtener valor.
     */
    public int obtenerValor()
    {
        return valorVariable;
    }
}
