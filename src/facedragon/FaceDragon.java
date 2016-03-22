/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facedragon;

import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Game;
import byui.cit260.faceDragon.model.Scene;

import byui.cit260.faceDragon.model.Player;
import byui.cit260.faceDragon.model.Weapon;


import byui.cit260.faceDragon.model.Location;
import byui.cit260.faceDragon.model.Map;
import byui.cit260.faceDragon.view.MainMenuView;
import byui.cit260.faceDragon.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Justin
 */
public class FaceDragon {
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outfile) {
        FaceDragon.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FaceDragon.inFile = inFile;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FaceDragon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FaceDragon.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    //instance of Player class to test it
    public static void main(String[] args) {
    try {
        //open character strem files for end user input and output
    FaceDragon.inFile = 
            new BufferedReader(new InputStreamReader(System.in));
    FaceDragon.outFile = new PrintWriter(System.out, true);
    //create start program view and start the program
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.display();
    return;
    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                            "\nMessage: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (FaceDragon.inFile != null)
                FaceDragon.inFile.close();
            if (FaceDragon.outFile != null)
                FaceDragon.outFile.close();
        } catch (IOException ex) {
            System.out.println("Error closing files");
            return;
        }
    }
//    try {
//        startProgramView.displayStartProgramView();
//    } catch (Throwable te) {
//        System.out.println(te.getMessage());
//        te.printStackTrace();
//        startProgramView.displayStartProgramView();
//    }
    
 
    }
    
}
