// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{
    private int speed;

    /**
     * 
     */
    public CannonBall(int speed)
    {
        this.speed = speed;
    }

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        if (this.isAtEdge()) {
            this.getWorld().removeObject(this);
        }
        kill();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * we chech if the cannonball is intersecting ( hitiing ) the ladybug
     */
    public void kill()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * we transit to game over world 
     */
    public void transitionToGameOverWorld()
    {
        World GameOverWorld =  new GameOverWorld();
        Greenfoot.setWorld(GameOverWorld);
    }

    /**
     * we check if the game is over by checking if the ladybug is still alive 
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
