/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.GameControl;
import byui.cit260.faceDragon.model.Game;
import byui.cit260.faceDragon.model.InventoryItems;
import byui.cit260.faceDragon.model.Location;
import byui.cit260.faceDragon.model.Map;
import facedragon.FaceDragon;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                +"\n----------------------"
                +"\n| Game Play           |"
                +"\n----------------------"
                +"\nE - View Inventory"
                +"\nI - Inventory Menu"
                +"\nM - Move Location"
                +"\nV - View Map"
                +"\nO - Objectives"
                +"\nU - Use (Specific Item)"
                +"\nC - Collect Item"
                +"\nD - Drop Item"
                +"\nH - Help Menu"
                +"\nA - Attack"
                +"\nB - Mountain Exploration View"
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
            case "E":
                this.displayInventory();
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
            case "B":
                this.exploreMountain();
                break;
            case "Z":
                this.sortItems();
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
        //System.out.println("\n *** viewMap() function called ***");//
        Location [][] locations = FaceDragon.getCurrentGame().getMap().getLocation();
        double rowCount = FaceDragon.getCurrentGame().getMap().getRowCount();
        double columnCount = FaceDragon.getCurrentGame().getMap().getColumnCount();
        System.out.println("Map");
        for(int r=0; r<5; r++){
            System.out.println("-");
            System.out.println(r);
            for(int c=0; c<5; c++){
                System.out.println("|");
                System.out.println(c);
                if(locations[r][c].getVisited()){
                    System.out.println("~~");                
               }System.out.println("??");
            }System.out.println("|");
        }System.out.println("-");
        
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

    private void exploreMountain() {
        MountainExplorationView mountainExplorationView = new MountainExplorationView();
        mountainExplorationView.display();
    }

    private void displayInventory() {
        InventoryItems[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\n List of Inventory Items");
        System.out.println("Description" + "\t" + "Type");
        
        //for each inventory item
        for(InventoryItems inventoryItem : inventory) {
            //DISPLAY the description the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t" +
                               inventoryItem.getType() );
        }
    }

    private InventoryItems[] sortItems() {
        InventoryItems[] items = GameControl.sortItems(FaceDragon.getCurrentGame().getInventoryItems());
        return items;
    }
}
