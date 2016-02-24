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
 * @author Justin
 */
public class Characters implements Serializable{
    private String description;
    private String name;
    private double strength;
    private double experience;
    public Characters() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.experience) ^ (Double.doubleToLongBits(this.experience) >>> 32));
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
        final Characters other = (Characters) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.experience) != Double.doubleToLongBits(other.experience)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Characters{" + "description=" + description + ", name=" + name + ", strength=" + strength + ", experience=" + experience + '}';
    }
    
    

    
    
    
    
    
    
}
