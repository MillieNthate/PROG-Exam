/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.iproduct;

import mattressreportapp.ProductTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nthate
 */
public class ProductTestTest {
    
    public ProductTestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of GetTotalProductsSales_WithValidData_ReturnsCorrectValue method, of class ProductTest.
     */
    @Test
    public void testGetTotalProductsSales_WithValidData_ReturnsCorrectValue() {
        System.out.println("GetTotalProductsSales_WithValidData_ReturnsCorrectValue");
        ProductTest instance = new ProductTest();
        instance.GetTotalProductsSales_WithValidData_ReturnsCorrectValue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAverageSales_WithValidData_ReturnsCorrectValue method, of class ProductTest.
     */
    @Test
    public void testGetAverageSales_WithValidData_ReturnsCorrectValue() {
        System.out.println("GetAverageSales_WithValidData_ReturnsCorrectValue");
        ProductTest instance = new ProductTest();
        instance.GetAverageSales_WithValidData_ReturnsCorrectValue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
