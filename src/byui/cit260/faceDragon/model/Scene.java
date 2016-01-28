/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author breecarrick
 */
public class Scene implements Serializable{
    //class instance variables
    private String description;
    private String type;
    
    //constructor function
    public Scene() {
    }
    
    //getter and setter functions
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //hashcode and equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    //to string function
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", type=" + type + '}';
    }
    
}
