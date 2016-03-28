/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author breecarrick
 */
public class PrintScenesView extends View {

    public PrintScenesView() {
        super("enter the file path");
    }

    
    
    @Override
    public boolean doAction(String filePath) {
                //this.console.println("Print Scenes list stub function called");
        //prompt the user for a file path of where the report is to be printed
        //this.displayMessage = "\n\nEnter the file path for the report to be printed."; 
        //get the file path entered by the end user
        //String filePath = this.getInput();
        try {
            //call another view layer function that actually prints the report
            printScenesToFile(filePath);
        } catch (Exception ex) {
            //catch all runtime exception thrown during the execution/ call ErrorView.display()
            ErrorView.display("MainMenuView", ex.getMessage());
            return false;
        }
        
        // display a success message to the console of the report was printed successfully
        //** to the specified file path
        this.console.println("lists of scenes printed to " + filePath);
        return true;
    }

    private void printScenesToFile(String filePath) {
               //*** Must use character output stream write to file and use a for statement
        //***to go through the list of items to be displayed. The report must include
        //*** a title, column headings and at least two collumns of data for each 
        //** item in the list.
        try (PrintWriter out = new PrintWriter(filePath)) {
           
        //print title and column headings
        out.println("\n\n                Scenes                      ");
        out.printf("%n%-20s%12s", "Name", "Coordinates");
        out.printf("%n%-20s%12s", "____________", "____________");
        //turn scene enum into array
        Scene[] scenes = Scene.values();
        //print the description and coordinates of each scene
        for (Scene scene : scenes){
            String point = scene.getLocation().x + ", " + scene.getLocation().y;
            out.printf("%n%-20s%7s", scene.name()
                                    , point);
        }
        }catch (IOException ex) {
            this.console.println("I/O Error: " + ex.getMessage());
        }
    }
}
