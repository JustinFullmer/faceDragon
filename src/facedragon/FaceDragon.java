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
    
    Player playerOne = new Player();
    
    playerOne.setName("William Farmer");
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    
    //instance of WEapon Class to test it
    Weapon weaponOne = new Weapon();
    
    String weaponInfo = weaponOne.toString();
    System.out.println(weaponInfo);

    //instance of Game class to test it
    Game gameOne = new Game();
    
    gameOne.setDescription("Description of Game");
    gameOne.setProgress("Progress Completed");
    
    String gameInfo = gameOne.toString();
    System.out.println(gameInfo);
    
    //instance of Map class to test it
    Map mapOne = new Map();
    mapOne.setColumnCount(5);
    mapOne.setRowCount(3);
    String mapInfo = mapOne.toString();
    System.out.println(mapInfo);
    
    //instance of Location class to test it
    Location locationOne = new Location();
    locationOne.setColumn(1);
    locationOne.setRow(1);
    locationOne.setVisited("Yes");
    String locationInfo = locationOne.toString();
    System.out.println(locationInfo);
    
    //instance of Characters class to test it
    Characters charactersOne = new Characters();
    charactersOne.setDescription("Description of Characters");
    charactersOne.setName("Name of Characters");
    charactersOne.setStrength(0);
    String charactersInfo = charactersOne.toString();
    System.out.println(charactersInfo);
    
        //instance of Interaction class to test it
    Interaction interactionOne = new Interaction();
    interactionOne.setPrompt("prompt");
    String interactionInfo = interactionOne.toString();
    System.out.println(interactionInfo);
    //instance of Scene class to test it
    Scene sceneOne = new Scene();
    sceneOne.setType("Scene Type");
    String sceneInfo = sceneOne.toString();
    System.out.println(sceneInfo);

    }
    
}
