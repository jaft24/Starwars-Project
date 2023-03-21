
/*
@author jaleta

I am the author of this code; however, I did work with and asked help from my classmate Segni Tulu.
Additionally, I also consulted Prof. Damian Lampl on the clone part and some parts of the code and he did assist me.
Furthermore, I used some basic definitions and code structres from online sources.

*/




package com.mycompany.starwarssimu;

/* We should begin by making sure that the whole class implements Cloneable */

public class StarWarsCharacters implements Cloneable{
       
/* We set the Properties described in the instruction for the StarWarsCharacter Class*/
   
    // i. First Name
    private String FName; 
        public String getFName(){
            return this.FName;
        }
    
        public void setFName(String FName){
             this.FName = FName;    
        }
        
     // ii. Last Name
    private String LName; 
        public String getLName(){
            return this.LName;  
        }

        public void setLastName(String LName){
            this.LName = LName;
        }
        
    // iii. Age 
    private int Age;         
        public int getAge(){   
            return this.Age;
        }
    
        public void setAge(int Age){
            this.Age = Age;
        }
        
    // iv. Gender     
    private char Gender; 
        public char getGender(){
            return this.Gender;
        }
        
        public void setGender(char Gender){
            this.Gender = Gender;
        }
        
    // v. Force
        /* We will set the data type for force in the next class. 
           We cant se tit now because it is a combination of string and intigers that we need to discern values. */
    public TheForce Force; 
        public TheForce getForce(){
            return this.Force;
        }
        
        public void setForce(TheForce Force){
            this.Force = Force;
        }
        
    // vi. Taunt phrase    
    private String TPhrase; 
        public String getTPhrase(){
            return this.TPhrase;
        }
        public void setTPhrase(String TPhrase){ 
            this.TPhrase = TPhrase;
       }
        
   
        
        
    // These below you find the constructors as per the instruction for the StarWarsCharacter Class   
        
    // i.
    public StarWarsCharacters(){
        
      }
    
    // ii.
    public StarWarsCharacters(String aFName, String aLName){
        FName = aFName;
        LName = aLName;        
      }
    
    // iii.
     public StarWarsCharacters(String aFName, String aLName, TheForce aForce){
         FName = aFName;
         LName = aLName;
         Force = aForce;
      }
     
    // iv. 
     public StarWarsCharacters(String aFName, String aLName, int aAge, char aGender, TheForce aForce, String aTPhrase){
          setFName(aFName);
          LName = aLName;
          Age = aAge;
          Gender = aGender;
          Force = aForce;
          TPhrase = aTPhrase;
      }
        

   // The methods as per the given instructions are found below. 
    
   // i.  
   public void Taunt(){
       System.out.println(TPhrase);
     }
   
   // ii.
   public static void Fight(StarWarsCharacters Fighter1, StarWarsCharacters Fighter2){
       if (Fighter1.getForce().getSide()!= Fighter2.getForce().getSide()){
            
                 System.out.println(Fighter1.getFName() + " " +  Fighter1.getLName()  + " Fights " + Fighter2.getFName() + " " + Fighter2.getLName());
           
           // Opppsite Force
           if (Fighter1.getForce().getStrength()<Fighter1.getForce().getStrength()){
               System.out.println(Fighter2.getFName() + " " + Fighter2.getLName() + " Wins");
               System.out.println(Fighter2.getFName() + " " + Fighter2.getLName() + " gloats: " + Fighter2.getTPhrase());
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
         
           }
           else if (Fighter1.getForce().getStrength()>Fighter2.getForce().getStrength()) {
               System.out.println(Fighter1.getFName() + " " + Fighter1.getLName() + " Wins");
               System.out.println(Fighter1.getFName() + " " + Fighter1.getLName() + " gloats: " + Fighter1.getTPhrase());
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
          
           }
           else if (Fighter1.getForce().getStrength()== Fighter2.getForce().getStrength()){
               System.out.println("Thy Dark balances thy white and they Balance!");  
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
                           
           }
       }
       
       // Same Force
       else if(Fighter1.getForce().getSide()== Fighter2.getForce().getSide()){
             if (Fighter1.getForce().getStrength() < Fighter2.getForce().getStrength()){
               System.out.println(Fighter2.getFName() + " " + Fighter2.getLName() + " is stronger in the " + Fighter2.getForce().getSide() +
                   " side of the force than " + Fighter1.getFName() + " " + Fighter1.getLName()
                      );
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
           
             }
               else if (Fighter1.getForce().getStrength()>Fighter2.getForce().getStrength()){
               System.out.println(Fighter1.getFName() + " " + Fighter1.getLName() + " is stronger in the " + Fighter1.getForce().getSide() +
                   " side of the force than " + Fighter2.getFName() + " " + Fighter2.getLName()
                      ); 
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
                   
           }
               else if (Fighter1.getForce().getStrength()== Fighter1.getForce().getStrength()){
                System.out.println("Thy Light doesnt fight with thy light they equate!");   
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
          
               } 
       }
   }
   
   // iii. Here below we have the clone method.
     @Override
    public StarWarsCharacters clone() throws CloneNotSupportedException {
        return (StarWarsCharacters) super.clone();
    }
    
       } 
