/*
@author jaleta

I am the author of this code; however, I did work with and asked help from my classmate Segni Tulu, we did most of it helping eachother.
Additionally, I also consulted some seniors to assist me.
Furthermore, I used some basic definitions and code structres from online sources.

*/
package com.mycompany.starwarssimu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StarWarsCharactersTest {
    

    /**
     * Unit test of Taunt method.
     */
    @Test
    public void testTaunt() {
        System.out.println("Taunt");
        StarWarsCharacters firstCharachter = new StarWarsCharacters("Darth","Vader",42,'M',new TheForce(100,"Dark"),"It's always dark where I walk!");
        String expectedResult = "It's always dark where I walk!";
        String result= firstCharachter.getTPhrase();
        
        assertEquals(expectedResult, result);
    }

  
     @Test
    /**
     * Unit test of Fight method. 
     * StarWarsCharacter with the Same Sides, but different Strength.
     */
    
    public void testFight_Same_Sides_fights_With_Different_Strength(){
    
        System.out.println("Fight");
        System.out.println("Light vs Light. The winner depends on their Strength");
        StarWarsCharacters Fighter1 = new StarWarsCharacters("Obi Wan","Kenobi",57,'M',new TheForce(85,"Light"),"Good always take the evil out"); 
        StarWarsCharacters Fighter2 = new StarWarsCharacters("Princess","Leia",19,'F',new TheForce(75,"Light"),"You got Barbied");
        StarWarsCharacters.Fight(Fighter1,Fighter2);
        assertEquals("Obi Wan Kenobi is stronger in the Light side of the force than Princess Leia", Fighter1.getFName() + " " + Fighter1.getLName() + " is stronger in the " 
                + Fighter1.getForce().getSide() + " side of the force than " + Fighter2.getFName() + " " + Fighter2.getLName());
        
    }
    
    
    @Test
    /**
     * Unit test of Fight method. 
     * StarWarsCharacter with different sides and with different Strength.
     */
  
    public void testFight_Different_Sides_fights_With_Different_Strength(){
        
        System.out.println("Fight");
        System.out.println("Light vs Dark. Dark is Stronger");
        StarWarsCharacters Fighter1 = new StarWarsCharacters("Darth","Vader",42,'M',new TheForce(100,"Dark"),"It's always dark where I walk!");
        StarWarsCharacters Fighter2 = new StarWarsCharacters("Luke","Skywalker",19,'M',new TheForce(97,"Light"),"Shine Bright like a Diamond");
        StarWarsCharacters.Fight(Fighter1,Fighter2);
        assertEquals("Darth Vader fights Luke Skywalker and Darth Vader wins. Darth Vader gloats: It's always dark where I walk!", Fighter1.getFName() + " " + Fighter1.getLName() 
                + " fights " + Fighter2.getFName() + " " + Fighter2.getLName() + " and " + Fighter1.getFName() + " " + Fighter1.getLName() +" "+"wins." 
                      +" "+ Fighter1.getFName() + " " + Fighter1.getLName() +" " + "gloats:" +" "+ Fighter1.getTPhrase());

    }
    
    @Test 
    /**
     * Unit test of Fight method.
     * StarWarsCharacter with with different Sides and with the same Strength.
     */
   
    public void testFight_Different_Sides_fights_With_Same_Strength(){
    
        System.out.println("Fight");
        System.out.println("Light vs Dark. The winner depends on the Strength");
        StarWarsCharacters Fighter1 = new StarWarsCharacters("Emperor","Palpatine",82,'M',new TheForce(97,"Dark"),"I had it anyways"); 
        StarWarsCharacters Fighter2 = new StarWarsCharacters("Luke","Skywalker",19,'M',new TheForce(97,"Light"),"Shine Bright like a Diamond");
        StarWarsCharacters.Fight(Fighter1,Fighter2);
        assertEquals("Emperor Palpatine is equal with Luke Skywalker",Fighter1.getFName() + " " + Fighter1.getLName() + " is equal with "
                + Fighter2.getFName() + " " + Fighter2.getLName());
    }
    
    
    
    
}
