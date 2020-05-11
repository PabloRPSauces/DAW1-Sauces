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
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    Calculadora calculadora;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class");
    }
    
    @Before
    public void before() {
        System.out.println("before");
        calculadora=new Calculadora();
    }
    
    @After
    public void tearDown() {
        System.out.println("after");
        calculadora=null;
    }



    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma1() {
        System.out.println("suma1");
        int num1 = 3;
        int num2 = -7;
        int expResult = -4;
        int result = calculadora.suma(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSuma2() {
        System.out.println("suma2");
        int num1 = -3;
        int num2 = -7;
        int expResult = -10;
        int result = calculadora.suma(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testResta(){
        System.out.println("resta");
        int n1=6;
        int n2=2;
        int esperado=4;
        int resultado=calculadora.resta(n1, n2);
        assertEquals(esperado,resultado);
    }

    @Test(expected=ArithmeticException.class)
    public void testDivide(){
        System.out.println("divide");
        int n1=8;
        int n2=0;
        int esperado=2;
        int resultado=calculadora.divide(n1,n2);
        assertEquals(esperado,resultado);
        
    }
    
}
