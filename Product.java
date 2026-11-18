package com.mycompany.iproduct;

public class Product implements IProduct {
    // 2D Array: 3 products (rows) x 3 months (columns)
    private int[][] salesData;
    private String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

    public Product(int[][] salesData) {
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        // Average across 3 products (as per the sample screenshot)
        return (double) total / salesData.length; 
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = 0;
        int maxIndex = -1;

        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + "(" + maxSales + ")";
    }
}
