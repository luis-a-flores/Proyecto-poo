import greenfoot.*;  

public class Cadenas extends Actor
{
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    public Cadenas(int cont, String mensaje)
    {
        this.cont=cont;
        this.mensaje=mensaje;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("verdana",24));
        dibuja();
    }
    
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    
    public void incrementar()
    {
        cont ++;
        dibuja();
    }
    
    public void decrementar()
    {
        cont --;
        dibuja();
    }
    
    public int obtenerValor()
    {
        return cont;
    }
    
    public void act()
    {}
}
