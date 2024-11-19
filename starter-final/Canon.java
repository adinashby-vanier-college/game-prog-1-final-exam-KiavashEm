// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    private GreenfootImage[] imagesBlue;
    private int imageIndex = 0;
    private int frameCounter = 0;
    private int animationSpeed = 5;
    public static int Cooldown_Gun = -10;

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shoot();
    }

    /**
     * we 
     */
    public void shoot()
    {
        CannonBall cannonBall =  new CannonBall(20);
        cannonBall.setRotation(getRotation());
        this.getWorld().addObject(cannonBall, this.getX(), this.getY());
    }

    /**
     * 
     */
    private void animatedMovementForward()
    {
        frameCounter = frameCounter + 1;
        if (frameCounter % animationSpeed == 0) {
            imageIndex = (imageIndex + 1) % imagesBlue.length;
            setImage(imagesBlue[imageIndex]);
        }
    }
}
