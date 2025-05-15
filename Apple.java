import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    /**
     * Set Apple Image 
     */
    public Apple()
    {
        GreenfootImage myApple = new GreenfootImage("apple.png");
        setImage(myApple); 
    }

    int speed = 1;
    
    
    /**
     * Sets the location of the apple, and removes if it reaches the bottom
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        
    }
    
    /**
     * Increases the speed of the apple
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
