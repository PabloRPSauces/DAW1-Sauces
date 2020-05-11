/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class CalculadoraSumaTest {
    
    public CalculadoraSumaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.multiplica(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.divide(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
