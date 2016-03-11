/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author breecarrick
 */
public enum Scene implements Serializable{
    Farm("My Home", new Point(0, 0)),
    Village("Closest place to work.", new Point (0,1)),
    Forest1("Lots of trees.", new Point (0,2)),
    Forest2("Lots of trees.", new Point (0,3)),
    Mountain1("Many rocks ond ridges.", new Point(0,4)),
    Forest3("Dark and Scary.", new Point (1,0)),
    Forest4("Dark and Scary.", new Point (1,1)),
    Forest5("Dark and Scary.", new Point (1,2)),
    Forest6("Dark and Scary.", new Point (1,3)),
    Mountain2("Tall with cliffs.", new Point (1,4)),
    Cave1("Dark and filthy.", new Point (2,0)),
    Forest7("Creepy and dark.", new Point (2,1)),
    Forest8("Creepy and scary.", new Point (2,2)),
    Forest9("Dark and musty.", new Point (2,3)),
    Forest10("Dark and damp.", new Point (2,4)),
    Cave2("Dark and strange.", new Point (3,0)),
    Forest11("Dark and Scary.", new Point (3,1)),
    Lake("Shimmering with magic in the air.", new Point (3,2)),
    Mountain3("High with something magical about it.", new Point (3,3)),
    Mountain4("High with borken boulders.", new Point (3,4)),
    Forest12("Dark and musty", new Point (4,0)),
    Forest13("Dark and Scary.", new Point (4,1)),
    Forest14("Dark and Scary.", new Point (4,2)),
    Mountain5("A great tower on top.", new Point (4,3)),
    DragonsCave("Smoke filled, and really hot.", new Point (4,4));
    //class instance variables
    private final String description;
    private final Point location;
    
    //constructor function
    Scene(String description, Point location) {
        this.description = description;
        this.location = location;
    }
    
    //getter and setter functions
    public String getDescription() {
        return description;
    }

    public Point getLocation() {
        return location;
    }
    //to string function
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", location=" + location + '}';
}
}