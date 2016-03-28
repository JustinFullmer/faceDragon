/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author breecarrick
 */
public class HelpMenuView extends View{
    public HelpMenuView() {
                    super("\n"
                   +"\n----------------------------------"
                   +"\n|          Help Menu             |"
                   +"\n----------------------------------"
                   +"\nG - What is the goal of the game?"
                   +"\nC - What are the in game controls?"
                   +"\nR - Print Report"
                   +"\nQ - Quit to main menu"
                   +"\n----------------------------------");
    }
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.displayGoal();
                break;
            case "C":
                this.gameControls();
                break;
            case "R":
                this.printReport();
                break;
            case "Q":
                this.mainMenu();
                break;
            default:
                this.console.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
        }
    private void displayGoal() {
        this.console.println("\n ***displayGoal function called***");    
    }

    private void gameControls() {
        this.console.println("\n ***display gameControls() called***");
    }

    private void mainMenu() {
        //create main menu view object
        MainMenuView mainMenuView = new MainMenuView();
        //display the main menu view
        mainMenuView.display();
        
    }

    private void printReport() {
        new PrintCharactersView().display();
    }
}
