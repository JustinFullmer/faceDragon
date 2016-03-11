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
public class Game implements Serializable{
    private String description;
    private String progress;

    private InventoryItems[] inventoryItems;
    private Player player;
    private Map map;
    public Game() {
    }

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public InventoryItems[] getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(InventoryItems[] inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.progress);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "description=" + description + ", progress=" + progress + '}';
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.progress, other.progress);
    } 
}