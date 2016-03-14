/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Game;
import byui.cit260.faceDragon.model.Location;
//import byui.cit260.faceDragon.model.Location;
import byui.cit260.faceDragon.model.Map;
import byui.cit260.faceDragon.model.Scene;
import facedragon.FaceDragon;
import java.awt.Point;

/**
 *
 * @author Justin
 */
public class MapControl {

    public static void returnToPreviousLocation(Characters player) {
        Point tempLocation = player.getPreviousLocation();
        player.setPreviousLocation(player.getCurrentLocation());
        player.setCurrentLocation(tempLocation);
          }

    static void moveCharactersToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //static class createMap extends Map {

        public static Map createMap() {
            //create the map
            Map map = new Map(20, 20);
            //assign the different scenes to locations in the map
            assignScenesToLocations(map);
            
            return map;
        }
    //}


    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocation();
        
        //start point
        locations[0][0].setScene(Scene.Farm);
        locations[0][1].setScene(Scene.Village);
        locations[0][2].setScene(Scene.Forest1);
        locations[0][3].setScene(Scene.Forest2);
        locations[0][4].setScene(Scene.Mountain1);
        locations[1][0].setScene(Scene.Forest3);
        locations[1][1].setScene(Scene.Forest4);
        locations[1][2].setScene(Scene.Forest5);
        locations[1][3].setScene(Scene.Forest6);
        locations[1][4].setScene(Scene.Mountain2);
        locations[2][0].setScene(Scene.Cave1);
        locations[2][1].setScene(Scene.Forest7);
        locations[2][2].setScene(Scene.Forest8);
        locations[2][3].setScene(Scene.Forest9);
        locations[2][4].setScene(Scene.Forest10);
        locations[3][0].setScene(Scene.Cave2);
        locations[3][1].setScene(Scene.Forest11);
        locations[3][2].setScene(Scene.Lake);
        locations[3][3].setScene(Scene.Mountain3);
        locations[3][4].setScene(Scene.Mountain4);
        locations[4][0].setScene(Scene.Forest12);
        locations[4][1].setScene(Scene.Forest13);
        locations[4][2].setScene(Scene.Forest14);
        locations[4][3].setScene(Scene.Mountain5);
        locations[4][4].setScene(Scene.DragonsCave);
    }

    static class createMap extends Map {

        public createMap() {
        }
    }
    
}
