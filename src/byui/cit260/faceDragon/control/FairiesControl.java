/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

//import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.exceptions.FairiesControlException;
import byui.cit260.faceDragon.model.Player;

/**
 *
 * @author breecarrick
 */
public class FairiesControl {
    public static double fairyExperience(Player player, double userNumber) throws FairiesControlException {

        if (player == null) {
            //return -555;
            throw new FairiesControlException("Cannot update experience: player not detected");
        }
        if (player.getExperience() < 0) {
            //return -444;
            throw new FairiesControlException("Cannot update experience: experience is zero");
        }
        if (userNumber > 3) {
            //return 1000;
            throw new FairiesControlException("Number cannot be greater than 3");
        }
        if (userNumber < 1) {
            //return -111;
            throw new FairiesControlException("Number cannot be less than 1");
        }

        //Calculate the experience from meeting with the fairies
        double currentExperience = player.getExperience();
        double experienceFromFairies = currentExperience * userNumber;
        double overallExperience = experienceFromFairies + currentExperience;
        //update experience
        player.setExperience(overallExperience);

        return overallExperience;
    }
}
