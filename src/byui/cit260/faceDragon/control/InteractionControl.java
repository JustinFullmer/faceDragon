/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.exceptions.InteractionControlException;
import byui.cit260.faceDragon.view.InteractionView;

/**
 *
 * @author Justin
 */
public class InteractionControl {

    public static double attack(double weaponStrength, double currentExperience) throws InteractionControlException {

        if (weaponStrength < 0) {
            throw new InteractionControlException("Weapon Strength can't be lower than 0");
        }

        if (currentExperience < 0) {
            throw new InteractionControlException("Experience can't be lower than 0");
        }

        double overallWeaponStrength = weaponStrength * (Math.random() + 1);
        double attack = overallWeaponStrength + currentExperience;

        return attack;

    }

    public static boolean doAttack(double monsterStrength, double attackStrength) {

        return attackStrength >= monsterStrength;
    }

}
