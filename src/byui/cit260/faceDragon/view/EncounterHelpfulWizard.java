/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.FairiesControl;
import byui.cit260.faceDragon.exceptions.ExperienceControlException;
import byui.cit260.faceDragon.exceptions.FairiesControlException;
import byui.cit260.faceDragon.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breecarrick
 */
public class EncounterHelpfulWizard extends View {

        public EncounterHelpfulWizard() {
        //promptMessage = "Please enter a choice."
        super("\n*******************************************"
                + "\n* You have encountered a helpful wizard.  *"
                + "\n* Fairies. They offer you increased       *"
                + "\n* experience for your quest. Do you accept*"
                + "\n* it?                                     *"
                + "\n*******************************************"
                + "\n* Y - Yes                                 *"
                + "\n* N - No                                  *"
                + "\n*******************************************"
                + "\nPlease enter a choice: ");
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

        if (value.toUpperCase().equals("Y")) {
            //add experience and energy
            double currentEnergy;
            double currentExperience;
            try {
                currentEnergy = player.getEnergy();
                player.setEnergy(currentEnergy + 5);
                currentExperience = player.getExperience();
                player.setExperience(currentExperience + 5);
                this.console.println("\n The wizard has increased both your experience and your energy by 5 points and wishes you luck on your journey.");
            } catch (ExperienceControlException ex) {
                Logger.getLogger(EncounterHelpfulWizard.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else if (value.toUpperCase().equals("N")) {
            this.console.println("\n suit yourself.");
            return true;
        } else {
            ErrorView.display(this.getClass().getName(),"\nInvalid answer. You must enter either 'Y' or 'N'.");
            return false;
        }
    }
    
}
