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
        this.console.println("\n\nEnter the file path for the file where the report is to be saved."); 
        String filePath = this.getInput();
        try{
            
        }
        }
    
    public void printCharactersReport(enum Characters, String outputLocation){
        try(PrintWriter out = new PrintWriter(filePath)){
            out.println("\n\n       Characters          ");
            out.printf("%n%-20s%10s","Name","Location");
            out.printf("%n%-20s%10s","-----------","---------");
            Characters[] characters = Characters.values();
            for(Characters character = characters){
                out.printf("%n%-20s%7d",characters.name(), characters.getCurrentLocation());
            
        }catch (IOException ex){
            ErrorView.display(, )
        }
    }
