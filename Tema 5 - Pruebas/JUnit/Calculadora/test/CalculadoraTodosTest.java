/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assume;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Pablo
 */

@RunWith(value=Parameterized.class)
public class CalculadoraTodosTest {
    
    int a,b,esperado;
    enum Type{SUMA,RESTA};
    Type type;
    
    @Parameters
    public static Iterable<Object[]> getDatos(){
        return Arrays.asList(new Object[][]
                {{Type.SUMA,5,3,8},{Type.SUMA,11,3,14}, //casos suma
            
            
            {Type.RESTA,7,2,5},{Type.RESTA,15,4,11}//casos resta
        
        
        
        }        
                );
    }

    public CalculadoraTodosTest(Type type,int a, int b, int esperado) {
        this.a = a;
        this.b = b;
        this.esperado = esperado;
        this.type=type;
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        Calculadora calc=new Calculadora();
        Assume.assumeTrue(type==Type.SUMA);
        int real=calc.suma(a,b);
        assertEquals(esperado,real);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        Calculadora calc=new Calculadora();
        Assume.assumeTrue(type==Type.RESTA);
        int real=calc.resta(a,b);
        assertEquals(esperado,real);
    }
    
}
