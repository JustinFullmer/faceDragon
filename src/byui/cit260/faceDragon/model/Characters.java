/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.model;

import byui.cit260.faceDragon.exceptions.ExperienceControlException;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Justin
 */
public enum Characters implements Serializable {

    Troll1("Big, Nasty And Ornery.", 30, 0, new Point(2, 2), new Point(2, 2)),
    Troll2("Big, Brown, and Ornery.", 30, 0, new Point(4, 3), new Point(4, 3)),
    Robbers("Ugly Thieves.", 10, 0, new Point(0, 2), new Point(0, 2)),
    BlackKnight("Cruelest of Enemies.", 50, 0, new Point(3, 2), new Point(3, 2)),
    EvilWizard("Dressed in black robes, with an evil smile.", 40, 0, new Point(3, 4), new Point(3, 4)),
    Goblins("Green, Foul, and Rude", 10, 0, new Point(4, 0), new Point(4, 0)),
    Dragon("Giant, Fire Breathing, with teeth like razors.", 100, 0, new Point(4, 4), new Point(4, 4));

    private final String description;
    private final double strength;
    private final double experience;
    private final Point currentLocation;
    private final Point previousLocation;
    
    private ArrayList<InventoryItems> inventoryItems = new ArrayList<>();

    Characters(String description, double strength, double experience, Point currentLocation, Point previousLocation) {
        this.description = description;
        this.experience = experience;
        this.strength = strength;
        this.currentLocation = currentLocation;
        this.previousLocation = previousLocation;
    }

    public String getDescription() {
        return description;
    }

    public double getStrength() {
        return strength;
    }

    public double getExperience() 
                    throws ExperienceControlException {
        return experience;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public Point getPreviousLocation() {
        return previousLocation;
    }

    public ArrayList<InventoryItems> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ArrayList<InventoryItems> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public void setCurrentLocation(Location tempLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPreviousLocation(Point currentLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCurrentLocation(Point tempLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
