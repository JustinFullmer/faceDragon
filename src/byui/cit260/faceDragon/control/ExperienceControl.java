/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.exceptions.ExperienceControlException;

/**
 *
 * @author breecarrick
 */
public class ExperienceControl {
    public static double experience(double energyUsed, double currentExperience) throws ExperienceControlException{

        if (energyUsed <= 0) {
            //return -1;
            throw new ExperienceControlException("Cannot update experience: no energy used");
        }
        if (currentExperience < 0) {
            //return -2;
            throw new ExperienceControlException("Cannot update experience: no previous experience");
        }
        double experienceFromTask = energyUsed * 2;

        if (experienceFromTask > 100) {
            //return -3;
            throw new ExperienceControlException("Cannot update experience: gained too much experience");
        }
        double overallExperience = experienceFromTask + currentExperience;
          return overallExperience;
    }
}
