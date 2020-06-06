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
        move(2); 
        World actualWorld = getWorld();
        
        if(getX() >= actualWorld.getWidth()-20 || getX()<=20)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY()>=actualWorld.getHeight()-20 || getY()<=50)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        verificaExistencia();
    }
    /**
     * Verifica si toco a Diablito
     */
    public void verificaExistencia(){
        Nivel world = (Nivel)getWorld();
        Actor Personaje = getOneObjectAtOffset(0,0,Personaje.class);
        if(Personaje!=null)
        {
            getWorld().removeObject(Personaje);
            world.vidas.decrementar(); 
            world.life--;
            getWorld().addObject(new Personaje(),50,300);
            //verificaVidas();
             if(world.vidas.obtenerValor() <= 0)
            {
                GameOver showGO = new GameOver();
                showGO.work();
                Nivel.score = 0;
                Nivel.life = 3;
                getWorld().addObject(showGO,((getWorld().getWidth()/2)),((getWorld().getHeight()/2)));
            }
        }
    }
}
