/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.model.Characters;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Justin
 */
public class PrintCharactersView extends View{
    public PrintCharactersView(){
        super("Enter the File Path");
    }
    @Override
    public boolean doAction(String filePath) {
        try {
            printCharactersToFile(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            return false;
        }
        this.console.println("List of Characters printed to " + filePath);
        return true;
    }

    private void printCharactersToFile(String filePath) throws FileNotFoundException {
        try(PrintWriter out = new PrintWriter(filePath)){
            out.println("\n\n       Characters          ");
            out.printf("%n%-20s%10s","Name","Location");
            out.printf("%n%-20s%10s","-----------","---------");
            Characters[] character = Characters.values();
            for(Characters characters : character){
                out.printf("%n%-20s%7s",characters.name(), characters.getCurrentLocation());
            }
        }catch (IOException ex) {
            this.console.println("I/O Error: " + ex.getMessage());
        }
    }
}
