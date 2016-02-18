/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class InteractionControlTest {
    
    public InteractionControlTest() {
    }

    /**
     * Test of attack method, of class InteractionControl.
     */
    @Test
    public void testAttack() {
        //Test One
        System.out.println("attack");
        System.out.println("Test One");
        double weaponStrength = 10.0;
        double currentExperience = 20.0;
        double expResult = 0.0;
        InteractionControl instance = new InteractionControl();
        double result = instance.attack(weaponStrength, currentExperience);
        if (expResult >= 20 && expResult <=30) {
            assertTrue(true);
    }
        // TODO review the generated test code and remove the default call to fail.
                //Test Two
        System.out.println("attack");
        System.out.println("Test Two");
        weaponStrength = -10.0;
        currentExperience = 20.0;
        expResult = -1.0;
        result = instance.attack(weaponStrength, currentExperience);
        assertEquals(expResult, result, 0.0);
        
        //Test Three
        System.out.println("attack");
        System.out.println("Test Three");
        weaponStrength = 10.0;
        currentExperience = -20.0;
        expResult = -2.0;
        result = instance.attack(weaponStrength, currentExperience);
        assertEquals(expResult, result, 0.0);
        
        //Test Four
        System.out.println("attack");
        System.out.println("Test Four");
        weaponStrength = 0.0;
        currentExperience = 0.0;
        expResult = 0.0;
        result = instance.attack(weaponStrength, currentExperience);
        assertEquals(expResult, result, 0.0);
    }
    
}
