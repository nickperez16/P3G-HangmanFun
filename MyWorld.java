import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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

<<<<<<< Updated upstream
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

}
=======
        }

      
        //The following code picks a random word from the list of words, and finds the length of the word    
        int n = Greenfoot.getRandomNumber(1000);
        String s = (list.get(n));
        System.out.println(s);
        String strLength = s.length() + "";
        
        
        
        //gives players a hint on word.
        showText("the word has " + strLength + " letters",400,550); 

        
    }
    private void callWord()
    {
        
    }
    //prepare base for hangman
    private void prepBase()
    {
        HmBase hangmanBase = new HmBase();
        addObject(hangmanBase,300,250);
    }
    //prepare head for hangman
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
>>>>>>> Stashed changes
