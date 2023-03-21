
/*
@author jaleta

I am the author of this code; however, I did work with and asked help from my classmate Segni Tulu.
Additionally, I also consulted Prof. Damian Lampl on the clone part and some parts of the code and he did assist me.
Furthermore, I used some basic definitions and code structres from online sources.

*/

package com.mycompany.starwarssimu;

/* We should begin by importing methods from the other classes. */

import static com.mycompany.starwarssimu.StarWarsCharacters.Fight;
import static com.mycompany.starwarssimu.TheForce.Influence;
import static com.mycompany.starwarssimu.TheForce.MoveObject;


public class MainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        /* 
           Below is collection an array of the attributes of everycharacter mentioned under Main Application.
           The Reason that Force is declared before each item is that the two types of variables are reprsented under one 
           data type. It follows the format: 
           StarWarsCharacters Self-given name = new StarWarsCharacters("Firstname","LastName",Age,'Gender', Force representing variable,"Taunt_Phrase");
         */ 
        
        
        TheForce AVf = new TheForce(88,"Dark");
        StarWarsCharacters AVentess = new StarWarsCharacters("Asajj","Ventess",30,'F',AVf,"I am evil");
        
        TheForce BOf = new TheForce(85,"Light");
        StarWarsCharacters BOffee = new StarWarsCharacters("Bariss","Offee",30,'F',BOf,"Yes!");
        
        TheForce DVf = new TheForce(100,"Dark");
        StarWarsCharacters DVader = new StarWarsCharacters("Darth","Vader",42,'M',DVf,"It's always dark where I walk!");
        
        TheForce EPf = new TheForce(97,"Dark");
        StarWarsCharacters EPalpatine = new StarWarsCharacters("Emperor","Palpatine",82,'M',EPf,"I had it anyways");
        
        TheForce KRf = new TheForce(95,"Dark");
        StarWarsCharacters KRen = new StarWarsCharacters("Kylo","Ren",20,'M',KRf,"Dead!");
        
        TheForce LSf = new TheForce(97,"Light");
        StarWarsCharacters LSkywalker = new StarWarsCharacters("Luke","Skywalker",19,'M',LSf,"Shine Bright like a Diamond"); 
        
        TheForce OWKf = new TheForce(85,"Light");
        StarWarsCharacters OKenobi = new StarWarsCharacters("Obi Wan","Kenobi",57,'M',OWKf,"Good always take the evil out");
        
        TheForce PLf = new TheForce(75,"Light");
        StarWarsCharacters PLeia = new StarWarsCharacters("Princess","Leia",19,'F',PLf,"You got Barbied"); 
        
        TheForce Rf = new TheForce(96,"Light");
        StarWarsCharacters Rey = new StarWarsCharacters("Rey","",20,'F',Rf,"Light has higher power");
        
        TheForce STf = new TheForce(1,"Dark");
        StarWarsCharacters STrooper = new StarWarsCharacters("Storm","Trooper",25,'M',STf,"For the Master!");
        
        TheForce Yf= new TheForce(99,"Light");
        StarWarsCharacters Yoda = new StarWarsCharacters("Yoda","",896,'M',Yf, "Finally peace and quiet!");
        
        // Minimun Fight are below.
        
        // 1.
        Fight(Rey,AVentess);
        // 2. 
        Fight(LSkywalker,DVader);
        // 3.      
        Fight(LSkywalker,EPalpatine);
        // 4.
        Fight(BOffee,Yoda);
        // 5.
        Fight(BOffee,OKenobi);
        
        // Other
        
        MoveObject(AVentess,"Kylo");
        
        Influence(BOffee,"Yoda");
        Influence(STrooper,"Darth");
        
        // Here below are the 4 storm Trooper Clones with their own Taunt Phrases.
        StarWarsCharacters Clone1 = STrooper.clone();
        Clone1.setTPhrase("We");
        
        StarWarsCharacters Clone2 = STrooper.clone();
        Clone2.setTPhrase("are");
        
        StarWarsCharacters Clone3 = STrooper.clone();
        Clone3.setTPhrase("Storm");
        
        StarWarsCharacters Clone4 = STrooper.clone();
        Clone4.setTPhrase("Troopers!");
    } 
        
    
}

        

    
