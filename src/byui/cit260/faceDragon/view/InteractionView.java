/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.InteractionControl;
import byui.cit260.faceDragon.control.MapControl;
import byui.cit260.faceDragon.exceptions.ExperienceControlException;
import byui.cit260.faceDragon.exceptions.InteractionControlException;
import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Location;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Justin
 */
public class InteractionView extends View{

    public InteractionView(/* String interaction*/) {
        super("\n"
                +"\n**********************"
                +"\n**********************"
                +"\n You have encoutered a Troll."
                +"\n What do you want to do?"
                +"\nF - Fight"
                +"\nR - Run"
                +"\n**********************");
    }

        @SuppressWarnings("null")
        @Override
    public boolean doAction(String interaction) {
            String choice = "F";
            /*Temporary to test Interaction View*/
//            Characters monster = new Characters();
//            monster.setDescription("Troll");
//            monster.setStrength(30);
//            Characters player = new Characters();
//            player.setName("Justin");
//            player.setStrength(10);
//            player.setExperience(20);
//            Location currentLocation = new Location();
//            currentLocation.setCharacter(player);
//            currentLocation.setRow(2);
//            currentLocation.setColumn(5);
//            Location previousLocation = new Location();
//            previousLocation.setCharacter(player);
//            previousLocation.setRow(1);
//            previousLocation.setColumn(5);
//            player.setCurrentLocation(currentLocation);
//            player.setPreviousLocation(previousLocation);
            
            
            
        
//        if (choice.toUpperCase().equals("F")) {
//            try{
//                double result = InteractionControl.attack(player.getStrength(), player.getExperience());
//                boolean win = InteractionControl.doAttack(monster.getStrength(), result);
//                
//                if (win == true){
//                    this.console.println("\n You WIN!!!");
//                    return true;
//                }else {
//                    this.console.println("\nYou LOSE HAHAHAHAHA!!!!!");
//                    return false;
//                }
//            }catch (InteractionControlException ie){
//                ErrorView.display(this.getClass().getName(),ie.getMessage());
//            }   catch (ExperienceControlException ex) {
//                    Logger.getLogger(InteractionView.class.getName()).log(Level.SEVERE, null, ex);
//                }
//        } else if(choice.toUpperCase().equals("R")){
//                //return to previous location and display message have returned to previous location return true
//                MapControl.returnToPreviousLocation(player);
//                this.console.println("\n You returned to the previous location.");
//                return true;
//            }else 
        return false;
        }
}
