// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * We create an "act" constructor an call the methods from here 
     */
    public void act()
    {
        move();
        win();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * We make the Ladybug move ( define the movement )
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(4);
        }
    }

    /**
     * we check if the ladybug reached the target and the game is won
     */
    public void win()
    {
        Actor FinishLocation = getOneIntersectingObject(FinishLocation.class);
        if (FinishLocation != null) {
            World world = getWorld();
            world.removeObject(FinishLocation);
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * we check if the ladybug reached the target and the game is won
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * we transit to the game won world.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
