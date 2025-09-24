/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CalculatorTest {

    Calculator cal;

    public CalculatorTest() {
        cal = new Calculator();
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 1;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFactorial() {
        System.out.println("Factorial");
        int n = 5;
        Calculator instance = new Calculator();
        long expResult = 120;
        long result = instance.getFactorial(n);
        assertEquals(expResult, result);
    }

}
