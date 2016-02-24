/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import java.util.Scanner;

/**
 *
 * @author breecarrick
 */
public class HelpMenuView {
    private String menu;
    //private String promptMessage;
    
    public HelpMenuView() {
        this.menu = "\n"
                   +"\n----------------------------------"
                   +"\n|          Help Menu             |"
                   +"\n----------------------------------"
                   +"\nG - What is the goal of the game?"
                   +"\nC - What are the in game controls?"
                   +"\nQ - Quit to main menu"
                   +"\n----------------------------------";
    }
    public void displayHelpMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done); 
    
    }
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
        
            System.out.println("\n" + this.menu);
            
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
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.displayGoal();
                break;
            case "C":
                this.gameControls();
                break;
            case "Q":
                this.mainMenu();
                break;
            default:
                System.out.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
        }
    private void displayGoal() {
        System.out.println("\n ***displayGoal function called***");    
    }

    private void gameControls() {
        System.out.println("\n ***display gameControls() called***");
    }

    private void mainMenu() {
        //create main menu view object
        MainMenuView mainMenuView = new MainMenuView();
        //display the main menu view
        mainMenuView.displayMainMenuView();
        
    }
}
