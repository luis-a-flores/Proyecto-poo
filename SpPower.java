import greenfoot.*;  


public class SpPower extends Actor
{
    
    public void act() 
    {
        MyWorld w=(MyWorld)getWorld();
        Actor act =getOneIntersectingObject(Personaje.class);
        if(act !=null)
        {
            for(int i=1;i<=5;i++)
                w.power.incrementar();
            getWorld().removeObject(this);
        }
    }    
}
