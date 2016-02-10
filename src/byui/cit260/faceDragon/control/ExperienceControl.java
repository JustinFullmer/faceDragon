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
public class ExperienceControl {
    public static double experience(double energyUsed, double currentExperience){

        if (energyUsed <= 0) {
            return -1;
        }
        if (currentExperience < 0) {
            return -2;
        }
        double experienceFromTask = energyUsed * 2;

        if (experienceFromTask > 100) {
            return -3;
        }
        double overallExperience = experienceFromTask + currentExperience;
          return overallExperience;
    }
}
