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
public class Player implements Serializable{
    
    //class instance variables
    private String name;
    private double experience;
    private double energy;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.experience) ^ (Double.doubleToLongBits(this.experience) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.energy) ^ (Double.doubleToLongBits(this.energy) >>> 32));
        return hash;
        
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", experience=" + experience + ", energy=" + energy + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.experience) != Double.doubleToLongBits(other.experience)) {
            return false;
        }
        if (Double.doubleToLongBits(this.energy) != Double.doubleToLongBits(other.energy)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    
}
