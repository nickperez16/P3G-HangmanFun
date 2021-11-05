import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class Startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscreen extends World
{

    /**
     * Constructor for objects of class Startscreen.
     * 
     */
    public Startscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        
        // ArrayList<String> list = new ArrayList<String>();
        
        // try {
            // Reader.readInto(list);
        // } catch(Exception e) {
        
        // }
        
        
        // //scanner.nextLine();
        // for(int i = 0; i < 1; i++)
        // {
            // int n = Greenfoot.getRandomNumber(1000);
            // String s = (list.get(n));
            // System.out.println(s);
            // System.out.println(s.length());
            
        // }
        
            

        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        TitleLetters titleLetters = new TitleLetters();
        addObject(titleLetters,400,300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }

}
