/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operacionesbasicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class OperacionTest {
    
    public OperacionTest() {
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
     * Test of getOperador1 method, of class Operacion.
     */
    @Test
    public void testGetOperador1() {
        System.out.println("getOperador1");
        Operacion instance = null;
        int expResult = 0;
        int result = instance.getOperador1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperador1 method, of class Operacion.
     */
    @Test
    public void testSetOperador1() {
        System.out.println("setOperador1");
        int operador1 = 0;
        Operacion instance = null;
        instance.setOperador1(operador1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperador2 method, of class Operacion.
     */
    @Test
    public void testGetOperador2() {
        System.out.println("getOperador2");
        Operacion instance = null;
        int expResult = 0;
        int result = instance.getOperador2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperador2 method, of class Operacion.
     */
    @Test
    public void testSetOperador2() {
        System.out.println("setOperador2");
        int operador2 = 0;
        Operacion instance = new Operacion(0,operador2,0);
        instance.setOperador2(operador2);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Operacion.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Operacion instance = null;
        int expResult = 0;
        int result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultado method, of class Operacion.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        int resultado = 0;
        Operacion instance = null;
        instance.setResultado(resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addition method, of class Operacion.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int operador1 = 5;
        int operador2 = 3;
        int expResult = 8;
        Operacion instance = new Operacion(operador1,operador2,expResult); 
        int result = instance.addition(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Operacion.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int operador1 = 5;
        int operador2 = 3;
        int expResult = 2;
        Operacion instance = new Operacion(operador1,operador2,expResult); 
        int result = instance.subtract(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
