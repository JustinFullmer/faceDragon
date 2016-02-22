/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.control.FairiesControl;

/**
 *
 * @author breecarrick
 */
public class FairiesEncounterView {
    
    public FairiesEncounterView() {
        this.fairyEncounter();
    }
    public void fairyEncounter() {
        System.out.println(
            "\n**************************************************"
           +"\n*You have encountered the kingdom of the Fairies.*"
           +"\n*They offer you increased experience for your    *"
           +"\n*quest. Do you accept it?                        *"
           +"\n**************************************************"
        );
    }
}
