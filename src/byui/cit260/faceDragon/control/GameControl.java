/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.model.Game;
import byui.cit260.faceDragon.model.InventoryItems;
import byui.cit260.faceDragon.model.Map;
import byui.cit260.faceDragon.model.Player;
import facedragon.FaceDragon;
import java.util.ArrayList;

/**
 *
 * @author Justin
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        FaceDragon.setCurrentGame(game);
        game.setPlayer(player);
        ArrayList<InventoryItems> inventoryItems = new ArrayList<>();
        Map map = new MapControl.createMap();
               
        
    }   

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        FaceDragon.setPlayer(player);
        
        return player;
    }
}