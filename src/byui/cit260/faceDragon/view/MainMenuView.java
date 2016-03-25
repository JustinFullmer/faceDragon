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
public class MainMenuView extends View{

    public MainMenuView() {
        super("\n"
                +"\n----------------------"
                +"\n| Menu               |"
                +"\n----------------------"
                +"\nN - Start New Game"
                +"\nS - Save Game"
                +"\nR - Restart Saved Game"
                +"\nH - Help Menu"
                +"\nQ - Quit Game"
                +"\n----------------------");
    }      
    @Override
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
                this.console.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
        }

    private void startNewGame() {
        GameControl.createNewGame(FaceDragon.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
       
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game is to be saved."); 
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(FaceDragon.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //this.console.println("\n ***savedGame function called***");    
    }

    private void restartGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game is to be saved");
        String filePath = this.getInput();
        
        try {
            //star a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        //this.console.println("\n ***restartGame function called***");    
    }

    private void helpMenu() {
        //create help menu view object
        HelpMenuView helpMenuView = new HelpMenuView();
        //display the help menu view
        helpMenuView.display();
        
    }
    }

