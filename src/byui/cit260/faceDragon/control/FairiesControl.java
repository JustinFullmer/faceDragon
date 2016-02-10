/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

/**
 *
 * @author breecarrick
 */
public class FairiesControl {
    public double fairyExperience(double currentExperience, double userNumber) {

        if (currentExperience < 0) {
            return -444;
        }
        if (userNumber > 3) {
            return 1000;
        }
        if (userNumber < 1) {
            return -111;
        }

        //Calculate the experience from meeting with the fairies
        double experienceFromFairies = currentExperience * userNumber;
        double overallExperience = experienceFromFairies + currentExperience;

        return overallExperience;
    }
}
