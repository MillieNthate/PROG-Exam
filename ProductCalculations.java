package com.mycompany.iproduct;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductCalculationsTest {
    
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // Testing with a price of 100. 15% of 100 = 15.0
        ProductCalculations calc = new ProductCalculations(100.0);
        assertEquals(15.0, calc.GetVat(), 0.01);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // Testing with a price of 100. Total = 100 + 15 (VAT) + 5 (Comm) = 120.0
        ProductCalculations calc = new ProductCalculations(100.0);
        assertEquals(120.0, calc.GetTotal(), 0.01);
    }
}