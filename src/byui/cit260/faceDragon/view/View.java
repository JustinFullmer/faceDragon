/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import facedragon.FaceDragon;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    protected final BufferedReader keyboard = FaceDragon.getInFile();
    protected final PrintWriter console = FaceDragon.getOutFile();
    
    public View(){
        
    }
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        String value = null;
        boolean valid = false;
        
        try {
        while (!valid) {
            
            //get the value entered from the keyboard
        
            System.out.println("\n" + this.displayMessage);
            
            value= this.keyboard.readLine();
            value= value.trim();
            
            if (value.length() <1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value;
    }
}
