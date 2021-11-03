import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1); 
        ArrayList<String> list = new ArrayList<String>();

        try {
            Reader.readInto(list);
        } catch(Exception e) {

        }

        //scanner.nextLine();
        //for(int i = 0; i < 1; i++)
        //{
            int n = Greenfoot.getRandomNumber(1000);
            String s = (list.get(n));
            System.out.println(s);
            System.out.println(s.length());
            

        //}
        

    }

}