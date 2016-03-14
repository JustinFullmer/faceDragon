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
        Game game = new Game(); //create new game
        FaceDragon.setCurrentGame(game); // save in FaceDragon
        game.setPlayer(player); // save player in game
        //create the inventory list and save in the game
        InventoryItems[] inventoryItems = GameControl.createInventoryItems();
        game.setInventoryItems(inventoryItems);
        Map map = new MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move characters to starting position in the map
        MapControl.moveCharactersToStartingLocation(map);
               
        
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

    public static InventoryItems[] getSortedInventoryList() {
        System.out.println("\n*** getSortedInventoryList stub function called ***");
        return null;
    }

    public enum Item {
        excaliber,
        armor,
        knife,
        sword,
        gold,
        silver,
        fish,
        flowers;
    }
    private static InventoryItems[] createInventoryItems() {
         //created array(list) of incentory items
        InventoryItems[] inventory=
            new InventoryItems[8];
        
        InventoryItems excaliber = new InventoryItems();
        excaliber.setDescription("excaliber");
        excaliber.setType("weapon");
        inventory[Item.excaliber.ordinal()] = excaliber;
        
        InventoryItems armor = new InventoryItems();
        armor.setDescription("armor");
        armor.setType("weapon");
        inventory[Item.armor.ordinal()] = armor;
        
        InventoryItems knife = new InventoryItems();
        knife.setDescription("knife");
        knife.setType("weapon");
        inventory[Item.knife.ordinal()] = knife;
        
        InventoryItems sword = new InventoryItems();
        sword.setDescription("sword");
        sword.setType("weapon");
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItems gold = new InventoryItems();
        gold.setDescription("gold");
        gold.setType("money");
        inventory[Item.gold.ordinal()] = gold;
        
        InventoryItems silver = new InventoryItems();
        silver.setDescription("silver");
        silver.setType("money");
        inventory[Item.silver.ordinal()] = silver;
        
        InventoryItems fish = new InventoryItems();
        fish.setDescription("fish");
        fish.setType("food");
        inventory[Item.fish.ordinal()] = fish;
        
        InventoryItems flowers = new InventoryItems();
        flowers.setDescription("flowers");
        flowers.setType("miscellaneous");
        inventory[Item.flowers.ordinal()] = flowers;
        
         return inventory;
    }
}