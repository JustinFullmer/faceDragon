/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

/**
 *
 * @author Justin
 */
public class InteractionControl {
public static double attack(double weaponStrength, double currentExperience){

    if (weaponStrength < 0){
        return -1;
    }

    if (currentExperience < 0){
        return -2;
    }

double overallWeaponStrength = weaponStrength * Math.random();
double attack = overallWeaponStrength + currentExperience;

return attack;
  
    }
}