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
public class VillageView extends View{

        public VillageView() {
        super("\n*******************************************"
                + "\n* Welcome to the village, what would      *"
                + "\n* you like to do?                         *"
                + "\n*******************************************"
                + "\n* W - Work for Gold                       *"
                + "\n* B - Buy New Items                       *"
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
        if (value.toUpperCase().equals("W")) {
            this.displayMessage = "\n*******************************************"
                    + "\n* There are many people who need help     *"
                    + "\n* today. What would you like to do?       *"
                    + "\n*******************************************"
                    + "\n* B- work for the blacksmith              *"
                    + "\n* S- work in the stables                  *"
                    + "\n* C- collect materials                    *"
                    + "\n*******************************************"
                    + "\nPlease enter a choice: ";
            String getAnswer = this.getInput();
            if (getAnswer.toUpperCase().equals("B")) {
                //Working as a blacksmith will take 5 energy points and earn 5 gold coins.
                double currentEnergy = player.getEnergy();
                player.setEnergy(currentEnergy - 5);
                double currentMoney = player.getMoney();
                player.setMoney(currentMoney + 5);
                this.console.println("\n The black smith has payed you 5 gold coins. "
                        + "\n*Be sure to watch your energy! Doing work can be taxing.*");
            return true;
            } else if (getAnswer.toUpperCase().equals("S")) {
                //Working in the stables will take 3 energy points and earn 3 gold coins.
                double currentEnergy = player.getEnergy();
                player.setEnergy(currentEnergy - 3);
                double currentMoney = player.getMoney();
                player.setMoney(currentMoney + 3);
                this.console.println("\n You have been payed 3 gold coins. "
                        + "\n*Be sure to watch your energy! Doing work can be taxing.*");
                return true;
            } else if (getAnswer.toUpperCase().equals("C")) {
                //Collecting materials will take 7 energy points and earn 10 gold coins.
                double currentEnergy = player.getEnergy();
                player.setEnergy(currentEnergy - 7);
                double currentMoney = player.getMoney();
                player.setMoney(currentMoney + 10);
                this.console.println("\n You have been payed 10 gold coins. "
                        + "\n*Be sure to watch your energy! Doing work can be taxing.*");
                return true;
            } else {
                this.console.println("\nInvalid answer. You must enter either 'B', 'S', or 'C'.");
                return false;
            }
        } else if (value.toUpperCase().equals("B")) {
            
            this.displayMessage = "\n*******************************************"
                    + "\n* Welcome to the market!                  *"
                    + "\n* What would you like to buy?             *"
                    + "\n*******************************************"
                    + "\n* K- knife (10 coins)                     *"
                    + "\n* S- sword (20 coins)                     *"
                    + "\n* A- armor (30 coins)                     *"
                    + "\n*******************************************"
                    + "\nPlease enter a choice: ";
            String getAnswer = this.getInput();
            if (getAnswer.toUpperCase().equals("K")) {
                //kife costs 10 coins.
                double currentMoney = player.getMoney();
                player.setMoney(currentMoney - 10);
                this.console.println("\n You have bought a knife for 10 gold coins");
            return true;
            } else if (getAnswer.toUpperCase().equals("S")) {
                //sword costs 20 coins.
                double currentMoney = player.getMoney();
                player.setMoney(currentMoney - 20);
                this.console.println("\n You have bought a sword for 20 gold coins. ");
                return true;
            } else if (getAnswer.toUpperCase().equals("A")) {
                //armor costs 30 coins.
                double currentMoney = player.getMoney();
                player.setMoney(currentMoney - 30);
                this.console.println("\n You have bought armor for 30 gold coins. ");
                return true;
            } else {
                this.console.println("\nInvalid answer. You must enter either 'K', 'S', or 'A'.");
                return false;
            }
        } else {
            this.console.println("\nInvalid answer. You must enter either 'W' or 'B'.");
            return false;
        }
    }
    
}
