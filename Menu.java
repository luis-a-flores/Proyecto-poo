import greenfoot.*;  

/**
 *  Clase para colocar el menu en pantalla.
 */
public class Menu extends World
{
    Select seleccionaMenu = new Select(); 

    private int posicionSelector = 0;
    private int POSICIONSALIDA = 1;
    private int POSICIONPLAY = 0;
    
    public GreenfootSound musica =  new GreenfootSound("fabrica.wav");
    /**
     * Constructor que inicia el mundo
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(801, 600, 1); 
        prepare();
    }
    /**
     * Prepara el mundo, añade objetos.
     */
    private void prepare()
    {
        addObject(new Start(), 400, 450);
        addObject(new Exit(), 400, 550);
        addObject(seleccionaMenu, 100, 450);
        musica.playLoop();

    }
    /**
     * Funcion para escojer start o exit 
     */
    public void act(){
        if(Greenfoot.isKeyDown("UP") && posicionSelector != 0){
           posicionSelector ++; 
        }
        if(Greenfoot.isKeyDown("DOWN") && posicionSelector != 1){
           posicionSelector --; 
        }
        
        if(posicionSelector >= 2){
            posicionSelector = POSICIONPLAY;
        }
        if(posicionSelector < 0){
            posicionSelector = POSICIONSALIDA;
        }
        
        seleccionaMenu.setLocation(100, 450 + (posicionSelector * 100));
        verificaEntrada();
         
    }
    /**
     * Checa si se presiono enter o espacio.
     */
    public void verificaEntrada(){
        if(Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            if(posicionSelector == POSICIONPLAY){
                Greenfoot.setWorld(new Level1());
                musica.stop();
            }
            if(posicionSelector == POSICIONSALIDA){
                Greenfoot.stop();
                musica.stop();
            }
        }
    }
}
