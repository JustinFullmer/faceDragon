/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.exceptions.ExperienceControlException;
import byui.cit260.faceDragon.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breecarrick
 */
public class LakeExplorationView extends View {

    public LakeExplorationView() {
        super("\n*******************************************"
                + "\n* You have come to a lake, what would     *"
                + "\n* you like to do?                         *"
                + "\n*******************************************"
                + "\n* F - Fish                                *"
                + "\n* S - Swim                                *"
                + "\n*******************************************"
                + "\nPlease enter a choice: ");
    }

    @Override
    public boolean doAction(String playersAnswer) {
                    //this is temporary.. in order to test function
        Player player = new Player();
        player.setName("Bree");
        try {
            player.setExperience(20);
        } catch (ExperienceControlException ex) {
            Logger.getLogger(FairiesEncounterView.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (playersAnswer.toUpperCase().equals("F")) {
            try {
                double currentExperience = player.getExperience();
                double newExperience = currentExperience + 1;
                this.console.println("\n Congratulations! You have cought a fish! Your experience has been increased by 1 ");
                return true;
            } catch (ExperienceControlException ex) {
                Logger.getLogger(LakeExplorationView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (playersAnswer.toUpperCase().equals("S")) {
            
            this.displayMessage = "\n*******************************************"
                    + "\n* The lady of the lake presents you with  *"
                    + "\n* the sword Excalibur. Do you accept?     *"
                    + "\n*******************************************"
                    + "\n* Y- yes                                  *"
                    + "\n* N- no                                   *"
                    + "\n*******************************************"
                    + "\nPlease enter a choice: ";
            String getAnswer = this.getInput();
            if (getAnswer.toUpperCase().equals("Y")) {
                this.console.println("\n You are now equipt with the sword Excalibur.");
            return true;
            } else if (getAnswer.toUpperCase().equals("N")) {
                this.console.println("\n You have rejected this wonderful gift. You have sealed your fate.");
                return true;
            } else {
                this.console.println("\nInvalid answer. You must enter either 'Y' or 'N'.");
                return false;
            }
            //return true;
        } else {
            this.console.println("\nInvalid answer. You must enter either 'F' or 'S'.");
            return false;
        }
        return false;
    }

}
