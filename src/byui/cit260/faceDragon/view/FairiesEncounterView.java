/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.FairiesControl;
import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Location;
import java.util.Scanner;

/**
 *
 * @author breecarrick
 */
public class FairiesEncounterView {
    
    private String promptMessage;
    
    public FairiesEncounterView() {
        //promptMessage = "Please enter a choice."
        this.promptMessage = "\nPlease enter a choice: ";
        //display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
                "\n*******************************************"
               +"\n* You have encountered the kingdom of     *"
               +"\n* Fairies. They offer you increased       *"
               +"\n* experience for your quest. Do you accept*"
               +"\n* it?                                     *"
               +"\n*******************************************"
               +"\n* Y - Yes                                 *"
               +"\n* N - No                                  *"
               +"\n*******************************************"
        );
    }

    public void displayFairiesEncounterView() {
        boolean done = false;
        do {
            String playersAnswer = this.getPlayersAnswer();
            if (playersAnswer.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersAnswer);
        } while (!done);
    }

    private String getPlayersAnswer() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
        
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersAnswer) {
        //this is temporary.. in order to test function
        Characters player = new Characters();
        player.setName("Bree");
        player.setExperience(20);

        if (playersAnswer.toUpperCase().equals("Y")) {
            this.promptMessage = "Please enter a number between 1 and 3";
            String getNumber = this.getPlayersAnswer();
            double theNumber = Double.parseDouble(getNumber);
            double overallExperience = FairiesControl.fairyExperience(player, theNumber);
            System.out.println("\n Congratulations! The fairies have increased your experience to "+ overallExperience + ".");
            return true;
        } else if (playersAnswer.toUpperCase().equals("N")) {
            System.out.println("\n The fairies are insulted that you have denied their gift and leave.");
            return true;
        } else {
            System.out.println("\nInvalid answer. You must enter either 'Y' or 'N'.");
            return false;
        }
    }
}
