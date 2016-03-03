/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import java.util.Scanner;

/**
 *
 * @author breecarrick
 */
public class MovingLocationsView extends View{
    
    public MovingLocationsView() {
        super("\n"
                   +"\n----------------------------------"
                   +"\n|        Moving Locations        |"
                   +"\n----------------------------------"
                   +"\nN - North"
                   +"\nS - South"
                   +"\nE - East"
                   +"\nW - West"
                   +"\nF - Farm"
                   +"\nT - Town/Village"
                   +"\nL - Saved Locations"
                   +"\n----------------------------------");
    }
        @Override
        public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.north();
                break;
            case "S":
                this.south();
                break;
            case "E":
                this.east();
                break;
            case "W":
                this.west();
                break;
            case "F":
                this.farm();
                break;
            case "T":
                this.town();
                break;
            case "L":
                this.savedLocations();
                break;
            default:
                System.out.println("\n *** Invalid Selection *** Try Again ***");
                break;
        }
        return false;
        }
    private void north() {
        System.out.println("\n ***north function called***");    
    }
    private void south() {
        System.out.println("\n ***south function called***");    
    }
    private void east() {
        System.out.println("\n ***east function called***");    
    }
    private void west() {
        System.out.println("\n ***west function called***");    
    }
    private void farm() {
        System.out.println("\n ***farm function called***");    
    }
    private void town() {
        System.out.println("\n ***town function called***");    
    }
    private void savedLocations() {
        FairiesEncounterView fairiesEncounterView = new FairiesEncounterView();
        fairiesEncounterView.display();
        //System.out.println("\n ***savedLocations function called***");    
    }
}
