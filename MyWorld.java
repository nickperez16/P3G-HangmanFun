import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.*;

/**
 * The main world.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int counter;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.


        super(800, 600, 1); 
        prepBase();
        prepHead();
        prepBody();
        prepRArm();
        prepLArm();
        prepRLeg();
        prepLLeg();
        ArrayList<String> list = new ArrayList<String>();
        try {
            Reader.readInto(list);
        } catch(Exception e) {


        }

    

      
        //The following code picks a random word from the list of words, and finds the length of the word    
        int n = Greenfoot.getRandomNumber(1000);
        String s = (list.get(n));
        System.out.println(s);
        String strLength = s.length() + "";
        

        //gives players a hint on word.
        showText("the word has " + strLength + " letters",400,550); 
        
        
    }

    private void prepBase()
    {
        HmBase hangmanBase = new HmBase();
        addObject(hangmanBase,300,250);
    }

    private void prepHead()
    {
        HmHead hangmanHead = new HmHead();
        addObject(hangmanHead,200,152);
   
    }   

    //prepare body for hangman
    private void prepBody()
    {
        HmBody hangmanBody = new HmBody();
        addObject (hangmanBody,200,152);
    
    }

    //prepare right arm
    private void prepRArm()
    {
        RightArm hangmanRArm = new RightArm(); 
        addObject (hangmanRArm,200,152);
    }

    //prepare left arm
    private void prepLArm()
    {
        LeftArm hangmanLArm = new LeftArm();
        addObject(hangmanLArm,200,152);
    }

    //prepare right leg

    private void prepRLeg()
    {
        RightLeg hangmanRLeg = new RightLeg();
        addObject(hangmanRLeg,200,152);
    }

    //prepare left leg

    private void prepLLeg()
    {
        LeftLeg hangmanLLeg = new LeftLeg();
        addObject(hangmanLLeg,200,152);
    }
}

