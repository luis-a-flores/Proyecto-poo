import greenfoot.*;
import java.util.*;



public class Power extends Actor
{
    int shot=1;
    int shotSpeed=7;
    int position;
    
    public Power(int direction)
    {
        position=direction;
    }
    
    public void act() 
    {
        switch(position)
        {
            case 0://up
                if(getRotation()!=270)
                    setRotation(270);
            break;
            case 1://down
                if(getRotation()!=90)
                    setRotation(90);
            break;
            case 2://left
                if(getRotation()!=0)
                    setRotation(0);
            break;
            case 3://rigth
                if(getRotation()!=180)
                    setRotation(180);
            break;
        }
        List<Mono> Mono=getObjectsInRange(200,Mono.class);
        Iterator it=Mono.iterator();
        if(it.hasNext())
        {
            Mono m=(Mono)it.next();
            if(m!=null)
            {
                turnTowards(m.getX(),m.getY());
            }
        }
        move(4);
        Actor Mono=getOneObjectAtOffset(0,0,Mono.class);
        if(Mono!=null)
        {
            MyWorld w=(MyWorld)getWorld();
            getWorld().removeObject(Mono);
            w.puntos.incrementar();
            w.crearMono(1);
            getWorld().removeObject(this);
        }
        else
        {
            if((getX()>=getWorld().getWidth()-5) || (getX()<= 5))
            {
                getWorld().removeObject(this);
            }
            else
            {
                if((getY()>=getWorld().getHeight()-5) || (getY()<= 5))
                {
                    getWorld().removeObject(this);
                }
            }    
        }
    }
}

