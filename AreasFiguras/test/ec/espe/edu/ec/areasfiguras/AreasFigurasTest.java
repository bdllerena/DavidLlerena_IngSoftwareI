/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.areasfiguras;

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
public class AreasFigurasTest {
    
    public AreasFigurasTest() {
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
     * Test of getBase method, of class AreasFiguras.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        float base = 1.3F;
        AreasFiguras instance = new AreasFiguras(base,0.0F,0.0F,0.0F);
        float expResult = 1.3F;
        float result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class AreasFiguras.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        float base = 1321321.321312312F;
        AreasFiguras instance = new AreasFiguras(base,0.0F,0.0F,0.0F);
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class AreasFiguras.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        float altura = 4343.321321312F;
        AreasFiguras instance = new AreasFiguras(0.0F,altura,0.0F,0.0F);
        float expResult = 4343.321321312F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class AreasFiguras.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        float altura = 4343.321321312F;
        AreasFiguras instance = new AreasFiguras(0.0F,altura,0.0F,0.0F);
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseMayor method, of class AreasFiguras.
     */
    @Test
    public void testGetBaseMayor() {
        System.out.println("getBaseMayor");
        float basemayor = 432432432432423.2313213211F;
        AreasFiguras instance = new AreasFiguras(0.0F,0.0F,basemayor,0.0F);
        float expResult = 432432432432423.2F;
        float result = instance.getBaseMayor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBaseMayor method, of class AreasFiguras.
     */
    @Test
    public void testSetBaseMayor() {
        System.out.println("setBaseMayor");
        float basemayor = 432432432432423.2313213211F;
        AreasFiguras instance = new AreasFiguras(0.0F,0.0F,basemayor,0.0F);
        instance.setBaseMayor(basemayor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class AreasFiguras.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        float resultado = 123456789.234F;
        AreasFiguras instance = new AreasFiguras(0.0F,0.0F,0.0F,resultado);
        float expResult = 123456789.234F;
        float result = instance.getResultado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setResultado method, of class AreasFiguras.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        float resultado = 123456789.234F;
        AreasFiguras instance = new AreasFiguras(0.0F,0.0F,0.0F,resultado);
        instance.setResultado(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaCuadrado method, of class AreasFiguras.
     */
    @Test
    public void testAreaCuadrado() {
        System.out.println("areaCuadrado");
        float lado = 7.0F;
        AreasFiguras instance = new AreasFiguras(lado,0.0F,0.0F,0.F);
        float expResult = 49.0F;
        float result = instance.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCuadrado2() {
        System.out.println("areaCuadrado");
        float lado = 555.555F;
        AreasFiguras instance = new AreasFiguras(lado,0.0F,0.0F,0.F);
        float expResult = 308641.34375F;
        float result = instance.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCuadrado3() {
        System.out.println("areaCuadrado");
        float lado = 1234567890.1234567890F;
        AreasFiguras instance = new AreasFiguras(lado,0.0F,0.0F,0.F);
        float expResult = 1.52415799926901965E18F;
        float result = instance.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCuadrado4() {
        System.out.println("areaCuadrado");
        float lado = 0.0F;
        AreasFiguras instance = new AreasFiguras(lado,0.0F,0.0F,0.F);
        float expResult = 0.0F;
        float result = instance.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCuadrado5() {
        System.out.println("areaCuadrado");
        float lado = (float) Math.pow(1234567890.12F,2);
        AreasFiguras instance = new AreasFiguras(lado,0.0F,0.0F,0.F);
        float expResult = (float) 2.3230576681786212E36;
        float result = instance.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaTriangulo method, of class AreasFiguras.
     */
    @Test
    public void testAreaTriangulo() {
        System.out.println("areaTriangulo");
        float base = 5.0F;
        float altura = 6.0F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,0.F);
        float expResult = (base * altura/2);
        float result = instance.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTriangulo2() {
        System.out.println("areaTriangulo");
        float base = 56666.66666F;
        float altura = 6.0F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,0.F);
        float expResult = (base * altura/2);
        float result = instance.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTriangulo3() {
        System.out.println("areaTriangulo");
        float base = 5.53653653653653653F;
        float altura = 65435435534.0F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,0.F);
        float expResult = (base * altura/2);
        float result = instance.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTriangulo4() {
        System.out.println("areaTriangulo");
        float base = (float) Math.pow(5.53653653653653653F,5);
        float altura = 6.0F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,0.F);
        float expResult = (base * altura/2);
        float result = instance.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTriangulo5() {
        System.out.println("areaTriangulo");
        float base = (float) Math.pow(5.53653653653653653F,5) * (float) Math.pow(5.53653653653653653F,5);
        float altura = (float) Math.pow(5.53653653653653653F,5) * (float) Math.pow(5.53653653653653653F,5);
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,0.F);
        float expResult = (base * altura/2);
        float result = instance.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of areaTrapezio method, of class AreasFiguras.
     */
    @Test
    public void testAreaTrapezio() {
        System.out.println("areaTrapezio");
        float base = (float) Math.pow(5.53653653653653653F,5) * (float) Math.pow(5.53653653653653653F,9);
        float altura = (float) Math.pow(5.53653653653653653F,2) * (float) Math.pow(5.53653653653653653F,2);
        float basemayor = (float) Math.pow(5.53653653653653653F,4) * (float) Math.pow(5.53653653653653653F,5);
        AreasFiguras instance = new AreasFiguras(base,altura,basemayor,0.F);
        float expResult = (((base*altura)/2)*basemayor);
        float result = instance.areaTrapezio(base, altura, basemayor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTrapezio2() {
        System.out.println("areaTrapezio");
         float base = (float) Math.pow(5.53653653653653653F,5) * (float) Math.pow(5.53653653653653653F,9);
        float altura = (float) Math.pow(5.53653653653653653F,2) * (float) Math.pow(5.53653653653653653F,2);
        float basemayor = (float) Math.pow(5.53653653653653653F,4) * (float) Math.pow(5.53653653653653653F,5);
        AreasFiguras instance = new AreasFiguras(base,altura,basemayor,0.F);
        float expResult = (((base*altura)/2)*basemayor);
        float result = instance.areaTrapezio(base, altura, basemayor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTrapezio3() {
        System.out.println("areaTrapezio");
         float base = (float) Math.pow(5.53653653653653653F,5) + (float) Math.pow(5.53653653653653653F,9);
        float altura = (float) Math.pow(5.53653653653653653F,2) - (float) Math.pow(5.53653653653653653F,2);
        float basemayor = (float) Math.pow(5.53653653653653653F,4) / (float) Math.pow(5.53653653653653653F,5);
        AreasFiguras instance = new AreasFiguras(base,altura,basemayor,0.F);
        float expResult = (((base*altura)/2)*basemayor);
        float result = instance.areaTrapezio(base, altura, basemayor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTrapezio4() {
        System.out.println("areaTrapezio");
         float base = (float) Math.pow(5.53653653653653653F,5) / (float) Math.pow(5.53653653653653653F,9);
        float altura = (float) Math.pow(5.53653653653653653F,2) + (float) Math.pow(5.53653653653653653F,2);
        float basemayor = (float) Math.pow(5.53653653653653653F,4) - (float) Math.pow(5.53653653653653653F,5);
        AreasFiguras instance = new AreasFiguras(base,altura,basemayor,0.F);
        float expResult = (((base*altura)/2)*basemayor);
        float result = instance.areaTrapezio(base, altura, basemayor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaTrapezio5() {
        System.out.println("areaTrapezio");
         float base = (float) Math.pow(5.53653653653653653F,5) * (float) Math.pow(5.53653653653653653F,9);
        float altura = (float) Math.pow(5.53653653653653653F,2) * (float) Math.pow(5.53653653653653653F,2);
        float basemayor = (float) Math.pow(5.53653653653653653F,4) * (float) Math.pow(5.53653653653653653F,5);
        AreasFiguras instance = new AreasFiguras(base,altura,basemayor,0.F);
        float expResult = (((base*altura)/2)*basemayor);
        float result = instance.areaTrapezio(base, altura, basemayor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of areaCirculo method, of class AreasFiguras.
     */
    @Test
    public void testAreaCirculo() {
        System.out.println("areaCirculo");
        float radio = (float) Math.pow(5.53653653653653653F,5) * (float) Math.pow(5.53653653653653653F,9);
        AreasFiguras instance = new AreasFiguras(radio,0.0F,0.0F,0.0F);
        float expResult = ((float) (Math.pow(radio,2)*Math.PI));
        float result = instance.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCirculo2() {
        System.out.println("areaCirculo");
        float radio = (float) Math.pow(5.53653653653653653F,5) / (float) Math.pow(5.53653653653653653F,9);
        AreasFiguras instance = new AreasFiguras(radio,0.0F,0.0F,0.0F);
        float expResult = ((float) (Math.pow(radio,2)*Math.PI));
        float result = instance.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCirculo3() {
        System.out.println("areaCirculo");
        float radio = (float) Math.pow(5.53653653653653653F,5) - (float) Math.pow(5.53653653653653653F,9);
        AreasFiguras instance = new AreasFiguras(radio,0.0F,0.0F,0.0F);
        float expResult = ((float) (Math.pow(radio,2)*Math.PI));
        float result = instance.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCirculo4() {
        System.out.println("areaCirculo");
        float radio = (float) Math.pow(5.53653653653653653F,5) + (float) Math.pow(5.53653653653653653F,9);
        AreasFiguras instance = new AreasFiguras(radio,0.0F,0.0F,0.0F);
        float expResult = ((float) (Math.pow(radio,2)*Math.PI));
        float result = instance.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCirculo5() {
        System.out.println("areaCirculo");
        String radioC = "4343143143143.535245252";
        float radio = Float.parseFloat(radioC);
        AreasFiguras instance = new AreasFiguras(radio,0.0F,0.0F,0.0F);
        float expResult = ((float) (Math.pow(radio,2)*Math.PI));
        float result = instance.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of areaParalelogramo method, of class AreasFiguras.
     */
    @Test
    public void testAreaParalelogramo() {
        System.out.println("areaParalelogramo");
        float base = 1.0F;
        float altura = 1.0F;
        float expResult = 1.0F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,expResult);
        float result = instance.areaParalelogramo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaParalelogramo2() {
        System.out.println("areaParalelogramo");
        float base = 50.0F;
        float altura = 50.0F;
        float expResult = 2500.0F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,expResult);
        float result = instance.areaParalelogramo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaParalelogramo3() {
        System.out.println("areaParalelogramo");
        float base = 55543243243252.231321312F;
        float altura = 555431431.43143141F;
        float expResult = (float) 3.0850461450021383E22;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,expResult);
        float result = instance.areaParalelogramo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaParalelogramo4() {
        System.out.println("areaParalelogramo");
        float base = 555.555F * 666.66F;
        float altura = 555.6F/666.4F;
        float expResult = 308786.75F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,expResult);
        float result = instance.areaParalelogramo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaParalelogramo5() {
        System.out.println("areaParalelogramo");
        float base = 55.66F;
        float altura = 0.0F;
        if(altura==0)
        {
            altura=1.0F;
        }
        float expResult = 55.65999984741211F;
        AreasFiguras instance = new AreasFiguras(base,altura,0.0F,expResult);
        float result = instance.areaParalelogramo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
