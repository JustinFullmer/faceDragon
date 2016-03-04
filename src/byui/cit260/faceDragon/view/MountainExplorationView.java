/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import byui.cit260.faceDragon.model.Weapon;

/**
 *
 * @author breecarrick
 */
public class MountainExplorationView extends View {

    public MountainExplorationView() {
        super("\n*******************************************"
                + "\n* You have found the armour of Arthur     *"
                + "\n* Do you want to pick it up?              *"
                + "\n*******************************************"
                + "\n* Y - Yes                                 *"
                + "\n* N - No                                  *"
                + "\n*******************************************"
                + "\nPlease enter a choice: ");
    }

    @Override
    public boolean doAction(String playersAnswer) {
        //temporary in order to test function
        Weapon weaponX = new Weapon();
        weaponX.setStrength(10);
        if (playersAnswer.toUpperCase().equals("Y")) {
            double currentStrength = weaponX.getStrength();
            double weaponStrength = currentStrength + 20;
            System.out.println("\n Congratulations! Your weapon experience has been increased to " + weaponStrength + ".");
            return true;
        } else if (playersAnswer.toUpperCase().equals("N")) {
            System.out.println("\n You have said no to the armor of Arthur. It disappears from in front of you, never to be seen again.");
            return true;
        } else {
            System.out.println("\nInvalid answer. You must enter either 'Y' or 'N'.");
            return false;
        }
    }

}
