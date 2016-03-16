/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.control;

import byui.cit260.faceDragon.model.InventoryItems;
import byui.cit260.faceDragon.model.Player;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class GameControlTest {

    public GameControlTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */

    /**
     * Test of createPlayer method, of class GameControl.
     */
    /*@Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String name = "";
        Player expResult = null;
        Player result = GameControl.createPlayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSortedInventoryList method, of class GameControl.
     */
    /**
     * Test of sortItems method, of class GameControl.
     */
    @Test
    public void testSortItems() {
        System.out.println("sortItems Test1");
        InventoryItems[] orgItems = GameControl.createInventoryItems();
        //GameControl instance = new GameControl();
        InventoryItems[] expResult
                  = new InventoryItems[8];
        InventoryItems armor = new InventoryItems();
        armor.setDescription("armor");
        armor.setType("weapon");
        expResult[0] = armor;

        InventoryItems excaliber = new InventoryItems();
        excaliber.setDescription("excaliber");
        excaliber.setType("weapon");
        expResult[1] = excaliber;
        
        InventoryItems fish = new InventoryItems();
        fish.setDescription("fish");
        fish.setType("food");
        expResult[2] = fish;
       
        InventoryItems flowers = new InventoryItems();
        flowers.setDescription("flowers");
        flowers.setType("miscellaneous");
        expResult[3] = flowers;
        
        InventoryItems gold = new InventoryItems();
        gold.setDescription("gold");
        gold.setType("money");
        expResult[4] = gold;

        InventoryItems knife = new InventoryItems();
        knife.setDescription("knife");
        knife.setType("weapon");
        expResult[5] = knife;

        InventoryItems silver = new InventoryItems();
        silver.setDescription("silver");
        silver.setType("money");
        expResult[6] = silver;

        InventoryItems sword = new InventoryItems();
        sword.setDescription("sword");
        sword.setType("weapon");
        expResult[7] = sword;
        
        InventoryItems[] result = GameControl.sortItems(orgItems);
        assertArrayEquals(expResult, result);
        
        System.out.println("sortItems Test2");
        //GameControl instance = new GameControl();
        expResult= null;
        result = GameControl.sortItems(null);
        assertArrayEquals(expResult, result);
    }

}
