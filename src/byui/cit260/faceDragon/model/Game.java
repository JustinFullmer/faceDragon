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
public class Game implements Serializable{
    //class instance variables
    private String description;
    private String progress;
    
    //constructor function

    public Game() {
    }
    
    //getter and setter classes

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    //equals and hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.progress);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.progress, other.progress)) {
            return false;
        }
        return true;
    }
    
    //tostring function

    @Override
    public String toString() {
        return "Game{" + "description=" + description + ", progress=" + progress + '}';
    }
    
}
