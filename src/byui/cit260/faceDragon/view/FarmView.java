/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.GameControl;
import byui.cit260.faceDragon.exceptions.ExperienceControlException;
import byui.cit260.faceDragon.model.Player;
import facedragon.FaceDragon;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breecarrick
 */
public class FarmView extends View {

        public FarmView() {
        //promptMessage = "Please enter a choice."
        super("\n Welcome to your farm! Would you like to refill your energy or save your game?"
                + "\n R- refill energy"
                + "\n S- save game");
    }
    
    @Override
    public boolean doAction(String value) {
        //this is temporary.. in order to test function
        Player player = new Player();
        player.setName("Bree");
        try {
            player.setExperience(20);
        } catch (ExperienceControlException ex) {
            Logger.getLogger(FairiesEncounterView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (value.toUpperCase().equals("R")) {
            //refill energy!
                player.setEnergy(100);
                this.console.println("\n Congratulations, your energy has been refilled!");
            return true;
        } else if (value.toUpperCase().equals("S")) {
            this.saveGame();
            return true;
        } else {
            ErrorView.display(this.getClass().getName(),"\nInvalid answer. You must enter either 'R' or 'S'.");
            return false;
        }
    }
    
    
        private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game is to be saved."); 
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(FaceDragon.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //this.console.println("\n ***savedGame function called***");    
    }
}
