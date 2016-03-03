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
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
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
                +"\nA - Attack"
                +"\nQ - Quit to Main Menu"
                +"\n----------------------");
    }      
    @Override
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
            case "A":
                this.attack();
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
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
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
        helpMenuView.display();   
    }

    private void attack() {
        InteractionView interactionView = new InteractionView();
        interactionView.display();
    }
}
