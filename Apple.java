import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
     public Apple()
    {
        GreenfootImage myApple = new GreenfootImage("apple.png");
        setImage(myApple);
    }
    
    public void act()
    {
        //Apple falls downwards.
        int x = getX();
        int y = getY() + 2;
        setLocation(x,y);
        
        //Remove apple and draw game over when apple gets to bottom
        //MyWorld world = (MyWorld) getWorld();
        //if(getY() >= world.getHeight())
        //{
            //world.gameOver();
            //world.removeObject(this);
        //}
    }
}
