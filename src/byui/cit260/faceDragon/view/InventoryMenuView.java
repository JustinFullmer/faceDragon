/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

/**
 *
 * @author Justin
 */
public class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|          Inventory Menu        |"
                + "\n----------------------------------"
                + "\nW - Weapons"
                + "\nR - Resources"
                + "\nT - Items"
                + "\nL - Energy Level and Experience"
                + "\nV - Implement Age"
                + "\nQ - Quit to Menu"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "W":
                this.displayWeapon();
                break;
            case "R":
                this.displayResources();
                break;
            case "T":
                this.displayItems();
                break;
            case "L":
                this.displayEnergy();
                break;
            case "V":
                this.displayAge();
                break;
            default:
                System.out.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
    }

    private void displayWeapon() {
        System.out.println("**** displayWeapon() function called");
    }

    private void displayResources() {
        System.out.println("**** displayResources() function called");
    }

    private void displayItems() {
        System.out.println("**** displayItems() function called");
    }

    private void displayEnergy() {
        System.out.println("**** displayEnergy() function called");
    }

    private void displayAge() {
        
    }

}
