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
            default:
                this.console.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
    }

    private void displayWeapon() {
        this.console.println("**** displayWeapon() function called");
    }

    private void displayResources() {
        this.console.println("**** displayResources() function called");
    }

    private void displayItems() {
        this.console.println("**** displayItems() function called");
    }

    private void displayEnergy() {
        this.console.println("**** displayEnergy() function called");
    }
}
