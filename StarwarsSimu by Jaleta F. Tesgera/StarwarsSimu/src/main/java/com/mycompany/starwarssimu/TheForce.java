
/*
@author jaleta

I am the author of this code; however, I did work with and asked help from my classmate Segni Tulu.
Additionally, I also consulted Prof. Damian Lampl on the clone part and some parts of the code and he did assist me.
Furthermore, I used some basic definitions and code structres from online sources.

*/


package com.mycompany.starwarssimu;

/* We should begin by making sure that the whole class implements Cloneable */

public final class TheForce implements Cloneable{
 
    
/* We set the Properties described in the instruction for the Force Class. */
  
   // i. 
   private int Strength;
    public int getStrength() {  
        return Strength;   
    }
    
    public void setStrength(int Strength) {
        this.Strength = Strength;   
    }

    // ii.
    private String Side;
         public String getSide() {
             return Side;
    }
        
    public void setSide(String Side) {
        this.Side = Side;
    }
    
   // These below you find the constructors as per the instruction for the Force Class.
    
    public TheForce(int aStrength, String aSide){
           setStrength(aStrength); 
           setSide(aSide); 
    }
    
    // The methods as per the given instructions are found below. 
    
    
    // i.
    public static void Influence(StarWarsCharacters SWCharacter, String target){
   
        if (SWCharacter.Force.Strength >= 60){
            System.out.println(SWCharacter.getFName() +  " " + SWCharacter.getLName() + " ensures " + target + " these aren't the droids they're looking for.");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");           
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
        else {
            System.out.println(SWCharacter.getFName()+ " " + SWCharacter.getLName()+ " fails to infulence "+ target);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        }
    }
        
   // ii. 
   public static void MoveObject(StarWarsCharacters SWCharacter, String target){
        
        if (SWCharacter.Force.Strength >= 60){
            System.out.println(SWCharacter.getFName()+  " " + SWCharacter.getLName() + " flings " + target + " across the room!");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");    
        }
        else {
            System.out.println(SWCharacter.getFName()+  " " + SWCharacter.getLName()+ " fails to infulence " + target);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");       
        }
    }
   
    // iii. Here below we have the clone method. 
    @Override
    public StarWarsCharacters clone() throws CloneNotSupportedException {
        return (StarWarsCharacters) super.clone();
    }

    
        
}
    

