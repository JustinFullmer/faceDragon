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
 * @author breecarrick
 */
public class ExperienceControlTest {
    
    public ExperienceControlTest() {
    }

    /**
     * Test of experience method, of class ExperienceControl.
     */
    @Test
    public void testExperience() {
        System.out.println("experience");
        System.out.println("Test One");
        double energyUsed = 12.0;
        double currentExperience = 40.0;
        
        double expResult = 64.0;
        
        ExperienceControl instance = new ExperienceControl();
        
        double result = ExperienceControl.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //TEST TWO
        System.out.println("Test Two");
        energyUsed = 15.0;
        currentExperience = 15.0;
        
        expResult = 45.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        
        //TEST THREE
        System.out.println("Test Three");
        energyUsed = -10.0;
        currentExperience = 20.0;
        
        expResult = -1.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        
        //TEST FOUR
        System.out.println("Test Four");
        energyUsed = 15.0;
        currentExperience = -5.0;
        
        expResult = -2.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        
        //TEST FIVE
        System.out.println("Test Five");
        energyUsed = 60.0;
        currentExperience = 32.0;
        
        expResult = -3.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        
        //TEST SIX
        System.out.println("Test Six");
        energyUsed = 12.0;
        currentExperience = 0.0;
        
        expResult = 24.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        
        //TEST SEVEN
        System.out.println("Test Seven");
        energyUsed = 1.0;
        currentExperience = 15.0;
        
        expResult = 17.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
        
        //TEST EIGHT
        System.out.println("Test Eight");
        energyUsed = 50.0;
        currentExperience = 15.0;
        
        expResult = 115.0;
        
        result = instance.experience(energyUsed, currentExperience);
        
        assertEquals(expResult, result, 0.0);
    }
    
}
