/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.model.Characters;
import byui.cit260.faceDragon.model.Player;
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
        Player player = new Player();
        player.setName("Bree");
        player.setExperience(52.0);
        System.out.println("fairyExperience");
        System.out.println("Test One");
        //double character = 52.0;
        double userNumber = 2.0;
        FairiesControl instance = new FairiesControl();
        double expResult = 156.0;
        double result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Test Two");
        player.setExperience(130.0);
        //character = 130.0;
        userNumber = 2.0;
        expResult = 390.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Three");
        player.setExperience(65.0);
        //character = 65.0;
        userNumber = 0.0;
        expResult = -111.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Four");
        player.setExperience(17.0);
        //character = 17.0;
        userNumber = 4.0;
        expResult = 1000.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Five");
        player.setExperience(-2.0);
        //character = -2.0;
        userNumber = 2.0;
        expResult = -444.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Six");
        player.setExperience(56.0);
        //character = 56.0;
        userNumber = 1.0;
        expResult = 112.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Seven");
        player.setExperience(42.0);
        //character = 42.0;
        userNumber = 3.0;
        expResult = 168.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Eight");
        player.setExperience(0.0);
        //character = 0.0;
        userNumber = 2.0;
        expResult = 0.0;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Nine");
        player = null;
        //character = 0.0;
        userNumber = 2.0;
        expResult = -555;
        result = instance.fairyExperience(player, userNumber);
        assertEquals(expResult, result, 0.0);
    }
    
}
