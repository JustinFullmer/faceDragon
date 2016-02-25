/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.model.Characters;

/**
 *
 * @author breecarrick
 */
public class FairiesControl {
    public static double fairyExperience(Characters character, double userNumber) {

        if (character == null) {
            return -444;
        }
        if (userNumber > 3) {
            return 1000;
        }
        if (userNumber < 1) {
            return -111;
        }

        //Calculate the experience from meeting with the fairies
        double currentExperience = character.getExperience();
        double experienceFromFairies = currentExperience * userNumber;
        double overallExperience = experienceFromFairies + currentExperience;
        //update experience
        character.setExperience(overallExperience);

        return overallExperience;
    }
}
