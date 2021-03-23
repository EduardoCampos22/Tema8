/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo
 */
public class MasGrandeTest
{    
    public MasGrandeTest()
    {
        
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }

    
/*
    @Test
    public void testMax()
    {
        System.out.println("max");
        int[] a = null;
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
    @Test
    public void testCardinalidad()
    {
        System.out.println("Test de cardinalidad");
        
        int[] a = {};
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testOrden()
    {
        System.out.println("Test de orden");
        
        int[] a = {5,3,9};
        int expResult = 9;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRango()
    {
        System.out.println("Test de rango");
        
        int[] a = {5,9};
        int expResult = 9;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
//    @Test
//    public void testReferencia()
//    {
//        System.out.println("Test de referencia");
//        
//        int[] a = {};
//        int expResult = ;
//        int result = MasGrande.max(a);
//        assertEquals(expResult, result);
//    }
    
    @Test
    public void testExistencia()
    {
        System.out.println("Test de existencia");
        
        int[] a = null;
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTiempo()
    {
        System.out.println("Test de tiempo");
        
        int[] a = null;
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
}
