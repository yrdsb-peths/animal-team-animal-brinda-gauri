import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Set the background image
        setBackground(new GreenfootImage("titleBackground2.jpg"));
        addObject(titleLabel, getWidth()/2, 60);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar 
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,getWidth()/2,getHeight()/2);
        
        Elephant elephant2 = new Elephant();
        addObject(elephant2,getWidth()/2 + 120,getHeight()/2);
        
        Elephant elephant3 = new Elephant();
        addObject(elephant3,getWidth()/2 - 120,getHeight()/2);
        
        Label arrowLabel = new Label("Use \u2190 and \u2192 to Move", 30);
        addObject(arrowLabel,getWidth()/2,getHeight()/2 + 142);
        Label spaceLabel = new Label("Press <space> to Start", 30);
        addObject(spaceLabel,getWidth()/2,getHeight()/2 + 175);
    }
}
