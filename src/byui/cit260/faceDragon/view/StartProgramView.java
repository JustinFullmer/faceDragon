/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.GameControl;
import byui.cit260.faceDragon.model.Player;
import java.util.Scanner;

/**
 *
 * @author breecarrick
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super(
                "\n**************************************************************"
                + "\n*                                                            *"
                + "\n*This is the game Face the Dragon.                           *"
                + "\n*In this game, you will be taking on the role of a farm boy. *"
                + "\n*Recently a dragon has invaded the kingdom. Many knights have*"
                + "\n*died trying to kill the dragon. As a final effort to save   *"
                + "\n*the kingdom the King has issued a proclamation that whoever *"
                + "\n*slays the dragon and brings back its head will be knighted  *"
                + "\n*and marry the Princess.                                     *"
                + "\n*                                                            *"
                + "\n*To be able to face this dragon you will need to gain        *"
                + "\n*experience and equipment. You will have to complete various *"
                + "\n*tasks in order to gain the experience and the gold you need.*"
                + "\n*Good luck, hope you don't die ;)                            *"
                + "\n*                                                            *"
                + "\n**************************************************************"
                + "\n Please Enter your Name:");
    }


    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        //prompt to type an age
        this.displayMessage = "\n Please enter your Age:";
                
        //call getinput function
        String strAge = this.getInput();
        
        int age; 
        try{
        age = Integer.parseInt(strAge);
        }catch (NumberFormatException nf){
            ErrorView.display(this.getClass().getName(),"Not a valid number. Please try again.");
            return false;
        }
        if (age < 13){
            ErrorView.display(this.getClass().getName(),"Too Young");
            return true;
        }
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { // if unsuccessful
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }

        //display next view
        this.displayNextView(player);

        return true; //success
    }

    private void displayNextView(Player player) {
        //display a custom welcome message
        this.console.println("\n====================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n=====================================");
        //create MainMenuWiew object
        MainMenuView mainMenuView = new MainMenuView();

        //display the main menu view
        mainMenuView.display();
    }

    private void displayNextView(boolean player) {
        this.console.println("\n ***  function called ***");
    }
}
