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
public class FairiesControlTest {
    
    public FairiesControlTest() {
    }

    /**
     * Test of fairyExperience method, of class FairiesControl.
     */
    @Test
    public void testFairyExperience() {
        System.out.println("fairyExperience");
        System.out.println("Test One");
        double currentExperience = 52.0;
        double userNumber = 2.0;
        FairiesControl instance = new FairiesControl();
        double expResult = 156.0;
        double result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Two");
        currentExperience = 130.0;
        userNumber = 2.0;
        expResult = 390.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Three");
        currentExperience = 65.0;
        userNumber = 0.0;
        expResult = -111.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Four");
        currentExperience = 17.0;
        userNumber = 4.0;
        expResult = 1000.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Five");
        currentExperience = -2.0;
        userNumber = 2.0;
        expResult = -444.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Six");
        currentExperience = 56.0;
        userNumber = 1.0;
        expResult = 112.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Seven");
        currentExperience = 42.0;
        userNumber = 3.0;
        expResult = 168.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Eight");
        currentExperience = 0.0;
        userNumber = 2.0;
        expResult = 0.0;
        result = instance.fairyExperience(currentExperience, userNumber);
        assertEquals(expResult, result, 0.0);
    }
    
}
