/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Location;

/**
 *
 * @author Justin
 */
public class MapControl {

    public static void returnToPreviousLocation(Characters player) {
        Location tempLocation = player.getPreviousLocation();
        player.setPreviousLocation(player.getCurrentLocation());
        player.setCurrentLocation(tempLocation);
          }
    
}
