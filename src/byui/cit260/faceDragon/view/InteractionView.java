/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.InteractionControl;
import byui.cit260.faceDragon.control.MapControl;
import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Location;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class InteractionView {
        private String interaction;
    //private String promptMessage;

    public InteractionView(/* String interaction*/) {
        this.interaction = "\n"
                +"\n**********************"
                +"\n**********************"
                +"\n You have encoutered a Troll."
                +"\n What do you want to do?"
                +"\nF - Fight"
                +"\nR - Run"
                +"\n**********************";
    }
    public void displayInteractionView() {
        boolean done = false;
        do {
            String interactionOption = this.getInteractionOption();
            if (interactionOption.toUpperCase().equals("R"))
                return;
            done = this.doAction(interaction);
        } while (!done);   
    
    }
    private String getInteractionOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
        
            System.out.println("\n" + this.interaction);
            
            value= keyboard.nextLine();
            value= value.trim();
            
            if (value.length() <1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break;
        }
        return value;
    }

    public boolean doAction(String interaction) {
            String choice = null;
            /*Temporary to test Interaction View*/
            Characters monster = new Characters();
            monster.setDescription("Troll");
            monster.setStrength(30);
            Characters player = new Characters();
            player.setName("Justin");
            player.setStrength(10);
            player.setExperience(20);
            Location currentLocation = new Location();
            currentLocation.setCharacter(player);
            currentLocation.setRow(2);
            currentLocation.setColumn(5);
            Location previousLocation = new Location();
            previousLocation.setCharacter(player);
            previousLocation.setRow(1);
            previousLocation.setColumn(5);
            player.setCurrentLocation(currentLocation);
            player.setPreviousLocation(previousLocation);
            
            
            
        
        if (choice.toUpperCase().equals("F")) {
           double result = InteractionControl.attack(player.getStrength(), player.getExperience());
           boolean win = InteractionControl.doAttack(monster.getStrength(), result);

           if (win == true){
               System.out.println("\n You WIN!!!");
               return true;
           }else {
               System.out.println("\nYou LOSE HAHAHAHAHA!!!!!");
               return false;
           }
        }else if(choice.toUpperCase().equals("R")){
            //return to previous location and display message have returned to previous location return true
            MapControl.returnToPreviousLocation(player);
            System.out.println("\n You returned to the previous location.");
            return true;
        }
        return false;
        }
}
