/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facedragon;

import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Game;
import byui.cit260.faceDragon.model.Interaction;
import byui.cit260.faceDragon.model.Scene;

import byui.cit260.faceDragon.model.Player;
import byui.cit260.faceDragon.model.Weapon;


import byui.cit260.faceDragon.model.Location;
import byui.cit260.faceDragon.model.Map;
import byui.cit260.faceDragon.view.MainMenuView;
import byui.cit260.faceDragon.view.StartProgramView;
/**
 *
 * @author Justin
 */
public class FaceDragon {
    private static Game currentGame = null;
    private static Player player = null;

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
    //test start program view
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
    }
    
}
