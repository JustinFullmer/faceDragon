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
public class InventoryItems implements Serializable{
    private String description;
    private String type;
    
    private Characters characters;
    
    private Location[] location;
    private Object items;

    public InventoryItems[]sortItems(InventoryItems[]orgItems) {
        InventoryItems[] items = orgItems.clone();
        if(orgItems==null){
            return null;   
        }
        int listLength = items.length;
        int nextPosition;
        for(int m =listLength; m>=0; m--){
            for (int i=0 ;i<listLength; i++){
                nextPosition = i+1;
                if(items[i].getDescription().compareTo(items[nextPosition].getDescription())>0){
                    swapNumbers(i, nextPosition, list);
                }
            }
        }
    }

    
    
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

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItems{" + "description=" + description + ", type=" + type + '}';
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
        final InventoryItems other = (InventoryItems) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }    
}
