package com.mycompany.iproduct;

import org.junit.Test;

public class ProductTest {
    
    @Test
    public void GetTotalProductsSales_WithValidData_ReturnsCorrectValue() {
        // Mock data: 10 + 10 + 10 = 30
        int[][] mockData = {{10, 10, 10}, {0, 0, 0}, {0, 0, 0}};
        Product product = new Product(mockData);
        assertEquals(30, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Mock data: Total = 30, Products = 3. Average = 10.0
        int[][] mockData = {{10, 10, 10}, {0, 0, 0}, {0, 0, 0}};
        Product product = new Product(mockData);
        assertEquals(10.0, product.GetAverageProductSold(), 0.01);
    }
}
