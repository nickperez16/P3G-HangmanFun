import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class MyWorld extends World
{
    /**
     * Apparently now it doesn't work, but the 'act' method
     * should still work as it doesn't use "Letter"
     */
    
    char[] letters = new Letter[26];
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        for(int i = 0; i < 26; i++) 
        {
            addObject(letters[i] = new Letter(i),
            25 + 38 * (i % 13), 510 + 30 * (i / 13));
        }
    }

     private void letterPressed(String keyInput)
    {
        letterInput(letters[(int)keyInput.charAt(0)-65]);
    }
    public void act()
    {
        String keyInput = Greenfoot.getKey();
        if(keyInput != null && keyInput.length() == 1)
        {
            keyInput = keyInput.toUpperCase();
            if(keyInput.charAt(0) >= 'A' && keyInput.charAt(0) <= 'Z') letterPressed(keyInput);
        }
    }
}
