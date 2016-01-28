/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facedragon;

import byui.cit260.faceDragon.model.Player;
import byui.cit260.faceDragon.model.Weapon;

import byui.cit260.faceDragon.model.Game;
import byui.cit260.faceDragon.model.Map;
/**
 *
 * @author Justin
 */
public class FaceDragon {

    /**
     * @param args the command line arguments
     */
    //instance of Player class to test it
    public static void main(String[] args) {
    Player playerOne = new Player();
    
    playerOne.setName("William Farmer");
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    

    Weapon weaponOne = new Weapon();
    
    String weaponInfo = weaponOne.toString();
    System.out.println(weaponInfo);

    //instance of Game class to test it
    Game gameOne = new Game();
    
    gameOne.setDescription("Description of Game");
    
    String gameInfo = gameOne.toString();
    System.out.println(gameInfo);
    
    //instance of Map class to test it
    Map mapOne = new Map();
    mapOne.setColumnCount(5);
    mapOne.setRowCount(3);
    String mapInfo = mapOne.toString();
    System.out.println(mapInfo);

    }
    
}
