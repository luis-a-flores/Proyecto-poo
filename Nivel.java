import greenfoot.*;  
import java.util.*;
/**
 * Clase padre de nivel 1, 2 y 3
 */
public class Nivel extends World
{
    int numeroMonos = 5;
   
    public Cadenas puntos;
    public Cadenas vidas;
 
    public static int score = 0; 
    public static int life = 3; 

    /**
     * Constructor para escenarios.
     * 
     */
    public Nivel()
    {    
        super(800, 600, 1);
        setPaintOrder(GameOver.class, Cadenas.class, Mono.class, Personaje.class);
        
        Personaje diablito = new Personaje();
        addObject(diablito,50,300);
        crearMono(numeroMonos);
      
        puntos= new Cadenas(score,"Score:");
        vidas= new Cadenas(life,"Life:");
  
        addObject(puntos,150,85);
        addObject(vidas, 270, 85);
        
        addEnemies();
    }
    
    /**
     * Crea los enemigos en pantalla.
     */
    public void crearMono(int cant)
    {
        for(int i=0;i<cant;i++)
        {
            Mono enemie= new Mono();
            int x=Greenfoot.getRandomNumber(400);
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(enemie,x + 350,y); 
        }
    }
    /**
     * Obtiene score.
     */
    public int getScore() {
        return this.score;
    }
    /**
     * Agrega dificultad a los niveles 2 y 3.
     */
    public void addEnemies(){
        int verifyLevel2 = 5;
        int verifyLevel3 = 10;
        if(score >= verifyLevel2 && score < verifyLevel3)
        {
            crearMono(2);
        }
        if(score >= verifyLevel3)
        {
            crearMono(5);
        }
    }
}
