import greenfoot.*;  
import java.util.*;
/**
 * Clase padre de nivel 1, 2 y 3
 */
public class Nivel extends World
{
    int x=5;
    // Variales para colocar puntps y vidas en pantalla
    public Cadenas puntos;
    public Cadenas vidas;
 
    public static int score = 0; // Variable identificadora score
    public static int life = 3; // Variable identificadora life
    /**
     * Constructor para escenarios.
     * 
     */
    public Nivel()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        //orden para que se vallan añadiendo
        setPaintOrder(GameOver.class, Cadenas.class, Mono.class, Personaje.class);
        // create new object
        Personaje n1 = new Personaje();
        // add object in world
        addObject(n1,50,300);
        //create other personajes
        crearMono(x);
      
        puntos= new Cadenas(score,"Score:");
        vidas= new Cadenas(life,"Life:");
  
        addObject(puntos,150,85);
        addObject(vidas, 270, 85);
        
        // Agrega 2 enemigos en Nivel 2
        if(score >= 5 && score < 10)
        {
            crearMono(2);
        }
        // Agrega 3 enemigos en Nivel 2
        if(score >= 10)
        {
            crearMono(5);
        }
    }
    
    /**
     * Crea los enemigos en pantalla.
     */
    public void crearMono(int cant)
    {
        for(int i=0;i<cant;i++)
        {
            Mono m= new Mono();
            int x=Greenfoot.getRandomNumber(400);
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(m,x + 350,y); // Posiciona al mono adelante de Dibalito
        }
    }
    public int getScore() {
        return this.score;
    }
}
