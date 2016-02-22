/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class GameControlView {
    private String menu;
    //private String promptMessage;

    public GameControlView(/*String menu*/) {
        this.menu = "\n"
                +"\n----------------------"
                +"\n| Game Play               |"
                +"\n----------------------"
                +"\nI - Inventory"
                +"\nM - Move Location"
                +"\nV - View Map"
                +"\nO - Objectives"
                +"\nU - Use (Specific Item)"
                +"\nC - Collect Item"
                +"\nD - Drop Item"
                +"\nH - Help Menu"
                +"\nQ - Quit to Main Menu"
                +"\n----------------------";
    }      

    /*MainMenuView() {
        this.menu;
    }*/
    public void displayGameControlView() {
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
            case "I":
                this.inventoryMenu();
                break;
            case "M":
                this.moveLocation();
                break;
            case "V":
                this.viewMap();
                break;
            case "O":
                this.objectives();
                break;
            case "U":
                this.useItem();
                break;
            case "C":
                this.collectItem();
                break;
            case "D":
                this.dropItem();
                break;
            case "H":
                this.helpMenu();
                break;
            default:
                System.out.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
        }

    private void inventoryMenu() {
        System.out.println("\n *** inventoryMenu() function called ***");
    }

    private void moveLocation() {
        MovingLocationsView movingLocations = new MovingLocationsView();
        movingLocations.display();
    }

    private void viewMap() {
        System.out.println("\n *** viewMap() function called ***");    
    }

    private void objectives() {
        System.out.println("\n *** objectives() function called ***");   
    }

    private void useItem() {
        System.out.println("\n *** useItem() function called ***");    
    }

    private void collectItem() {
        System.out.println("\n *** collectItem() function called ***");    
    }

    private void dropItem() {
        System.out.println("\n *** dropItem() function called ***");    
    }

    private void helpMenu() {
        //create help menu view object
        HelpMenuView helpMenuView = new HelpMenuView();
        //display the help menu view
        helpMenuView.displayHelpMenuView();   
    }
}
