/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.GameControl;
import facedragon.FaceDragon;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class MainMenuView {
    private String menu;
    private String promptMessage;

    public MainMenuView(String menu) {
        this.menu = "\n"
                +"\n----------------------"
                +"\n| Menu               |"
                +"\n----------------------"
                +"\nN - Start New Game"
                +"\nS - Save Game"
                +"\nR - Restart Saved Game"
                +"\nH - Help Menu"
                +"\nQ - Quit Game"
                +"\n----------------------";
    }      

    MainMenuView() {
        System.out.println("\n mainMenuView function called");
    }
    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.menuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);   
    
    }

    private String menuOption() {
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

    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "R":
                this.restartGame();
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

    private void startNewGame() {
        GameControl.createNewGame(FaceDragon.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
       
    }

    private void saveGame() {
        System.out.println("\n ***savedGame function called***");    
    }

    private void restartGame() {
        System.out.println("\n ***restartGame function called***");    
    }

    private void helpMenu() {
        System.out.println("\n ***helpMenu function called***");    
    }
    }
    
