package com.mycompany.iproduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        // 2D array: [product_index][month_index]
        int[][] salesData = new int[3][3]; 

        // 1. Capture Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + names[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // 2. Instantiate objects
        Product product = new Product(salesData);
        PrintProduct printer = new PrintProduct();

        // 3. Print Report
        printer.PrintReport(product);
        
        scanner.close();
    }
}
