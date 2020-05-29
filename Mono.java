import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Clase para el enemigo.
 */
public class Mono extends Actor
{
    /**
     * Metodo para manejar al objeto
     * Movimiento.
     */
    public void act() 
    {
        move(2); // Mueve al mono.
        World m = getWorld();
        // Configura posicion en X.
        if(getX() >= m.getWidth()-20 || getX()<=20)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        // Configura posicion en Y.
        if(getY()>=m.getHeight()-20 || getY()<=50)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        Actor Personaje = getOneObjectAtOffset(0,0,Personaje.class);
        // Verifica existencia Diablito.
        if(Personaje!=null)
        {
            Nivel w = (Nivel)getWorld();
            getWorld().removeObject(Personaje);
            w.vidas.decrementar(); // Decrementa vida
            w.life --;
            getWorld().addObject(new Personaje(),50,300); // Ubica al personaje si aun hay vidas.
            // Verifica si aun tiene vidas.
            if(w.vidas.obtenerValor() <= 0)
            {
                GameOver t = new GameOver(); // Termina el juego
                getWorld().addObject(t,((getWorld().getWidth()/2)),((getWorld().getHeight()/2)));
            }
        }       
    }
}
