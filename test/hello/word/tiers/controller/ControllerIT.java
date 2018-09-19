/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers.controller;

import hello.word.tiers.Controller;
import hello.word.tiers.Model;
import hello.word.tiers.ModelFactory;
import hello.word.tiers.ModelImplementation;
import hello.word.tiers.View;
import hello.word.tiers.ViewFactory;
import hello.word.tiers.ViewImplementation;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class ControllerIT {
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    
    
    @Before
    public void setUp() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    
    @After
    public void tearDown() {
        System.setOut(systemOut);
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        String greeting = ModelFactory.getModel().getGreeting();
        ViewFactory.getView().showGreeting(greeting);
        assertEquals("Shown greeting is not correct!!!!", greeting + "\n", testOut.toString());
    }
    
}
