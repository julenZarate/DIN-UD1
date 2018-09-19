/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers.model;

import hello.word.tiers.Model;
import hello.word.tiers.ModelImplementation;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelImplementationTest {
    private Model model;
    
    @Before
    public void setUp() {
       model = new ModelImplementation();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() throws Exception{
        String greeting = model.getGreeting();
        assertNotEquals("Ha fallado!", 0, greeting.length());
    }
    
}
