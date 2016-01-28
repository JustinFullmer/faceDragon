/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facedragon;

import byui.cit260.faceDragon.model.Player;

/**
 *
 * @author Justin
 */
public class FaceDragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Player playerOne = new Player();
    
    playerOne.setName("William Farmer");
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    }
    
}
