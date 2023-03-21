/*
@author jaleta

I am the author of this code; however, I did work with and asked help from my classmate Segni Tulu, we did most of it helping eachother.
Additionally, I also consulted some seniors to assist me.
Furthermore, I used some basic definitions and code structres from online sources.

*/

package com.mycompany.starwarssimu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TheForceTest {
    
 /**
     * This is the Unit Test of for the Move object method.  
     */
    @Test
    public void test_MoveObject() {
        //First Test
        System.out.println("MoveObject");
       StarWarsCharacters Fighter5 = new StarWarsCharacters("Luke","Skywalker",19,'M',new TheForce(97,"Light"),"Shine Bright like a Diamond");
        String Fighter6 = "Asajj Ventess";
        TheForce.MoveObject(Fighter5, Fighter6);
        assertEquals("Luke Skywalker flings Asajj Ventess across the room",Fighter5.getFName() + " " + Fighter5.getLName()
                + " flings "+ Fighter6 + " across the room");
    
        //Second Test 
        System.out.println("\n");
        StarWarsCharacters Fighter3 = new StarWarsCharacters("Emperor","Palpatine",82,'M',new TheForce(97,"Dark"),"I had it anyways");
        String Fighter4 = "Storm Trooper";
        TheForce.MoveObject(Fighter3, Fighter4);
        assertEquals("Emperor Palpatine flings Storm Trooper across the room",Fighter3.getFName() + " " + Fighter3.getLName() + " flings "
                + Fighter4 + " across the room");
    
        //Third Test
         System.out.println("\n");
         StarWarsCharacters Fighter1 = new StarWarsCharacters("Darth","Vader",42,'M',new TheForce(100,"Dark"),"It's always dark where I walk!");
        String Fighter2 = "Bariss Offee";
        TheForce.MoveObject(Fighter1, Fighter2);
        assertEquals("Darth Vader flings Bariss Offee across the room",Fighter1.getFName() + " " + Fighter1.getLName() 
                + " flings "+ Fighter2 + " across the room");
        
    
    }
    
    @Test
    /**
     *  This is the Unit Test of for the Influence method.
     */
    
    public void test_Influence() {
        //First Test
        System.out.println("\n");
        System.out.println("Influence");
        StarWarsCharacters Fighter1 = new StarWarsCharacters("Darth","Vader",42,'M',new TheForce(100,"Dark"),"It's always dark where I walk!");
        String Fighter_x = "Kylo Ren";
        TheForce.Influence(Fighter1, Fighter_x);
        assertEquals("Darth Vader ensures Kylo Ren aren't the droids they are looking for", Fighter1.getFName() + " " + Fighter1.getLName() + " ensures " + Fighter_x + " aren't the droids they are looking for");
        System.out.println("\n");
        
        //Second Test
        System.out.println("\n");
        System.out.println("Influence");
        StarWarsCharacters Fighter2 = new StarWarsCharacters("Luke","Skywalker",19,'M',new TheForce(97,"Light"),"Shine Bright like a Diamond");
        String Fighter_x1 = "Emperor Palpatine";
        TheForce.Influence(Fighter2, Fighter_x1);
        assertEquals("Luke Skywalker ensures Emperor Palpatine aren't the droids they are looking for", Fighter2.getFName() + " " + Fighter2.getLName() + " ensures " + Fighter_x1 + " aren't the droids they are looking for");
        
        //Thrid Test
        System.out.println("\n");
        System.out.println("Influence");
        StarWarsCharacters Fighter3 = new StarWarsCharacters("Storm","Trooper",25,'M',new TheForce(1,"Dark"),"For the Master!");
        String Fighter_x2 = "Yoda"; 
        TheForce.Influence(Fighter3, Fighter_x2);
        assertEquals("Storm Trooper fails to influence Yoda", Fighter3.getFName() + " " + Fighter3.getLName() + " fails to influence " + Fighter_x2);
        
    }
    
    /**
     * This is a Unit test of SetStrength method. 
     */
    @Test
    
    public void test_SetStrength() {
        
        // First test with the value of -55
        System.out.println("setStrength TESTER:");
        System.out.print("\n");
        System.out.println("Lower bound test");
        int val = -55;
        TheForce instance = new TheForce(90,"Light");
        instance.setStrength(val);
        System.out.print("\n");
        assertEquals(val,instance.getStrength());
        System.out.println("Tested value = " + val);
        
        //Second test with the value of 10
        System.out.println("\n");
        System.out.print("----------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("Interval test");
        int val1 = 10;
        TheForce instance1 = new TheForce(90,"Light");
        instance1.setStrength(val1);
        System.out.print("\n");
        assertEquals(val,instance.getStrength());
        System.out.println("Tested value = "+ val1);
        
        //Third test with the value of 1000
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.print("\n");
        System.out.println("Upper bound test");
        int val2 = 1000;
        TheForce instance2 = new TheForce(90,"Light");
        instance2.setStrength(val2);
        System.out.print("\n");
        assertEquals(val,instance.getStrength());
        System.out.println("Tested value = "+ val2);
        

    }
    
}
