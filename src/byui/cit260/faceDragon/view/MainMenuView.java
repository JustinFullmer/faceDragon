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
                System.out.println("\n *** Invalid Selection *** Try Again ***");
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
        System.out.println("\n ***savedGame function called***");    
    }

    private void restartGame() {
        System.out.println("\n ***restartGame function called***");    
    }

    private void helpMenu() {
        //create help menu view object
        HelpMenuView helpMenuView = new HelpMenuView();
        //display the help menu view
        helpMenuView.display();
        
    }
    }

