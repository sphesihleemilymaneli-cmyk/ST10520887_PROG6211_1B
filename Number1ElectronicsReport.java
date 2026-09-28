import java.util.Scanner;

public class Number1ElectronicsReport {
    public static void main(String[] args) {
        // Single arrays for cities and console 
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "NINTENDO SWITCH"};

        // 2D arrayS representing the sales data 
        // cities ROWS,consoles
        int[][] salesData = {
            {3000, 2000, 3000}, 
            {2000, 3000, 4000},
            {1500, 1100, 1200}          };

        // Display the report
        System.out.println("==================================================");
        System.out.println("  NUMBER 1 ELECTRONICS - YEARLY SALES REPORT");
        System.out.println("==================================================");

        // column headers
        System.out.printf("%-15s", "City");
        for (String console : consoles) {
            System.out.printf("%-18s", console);
        }
        System.out.printf("%-15s%n", "Total Sales");
        System.out.println("-------------------------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // Loop 
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s", cities[i]);
            int cityTotal = 0;

            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-18d", salesData[i][j]);
                cityTotal += salesData[i][j];
            }

            // Display total sales for each city
            System.out.printf("%-15d%n", cityTotal);

            // Determine the city with the most gaming console sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println("-------------------------------------------------------------------");
        // Display the city with the most sales
        System.out.println("\n>>> City with the most gaming console sales: " + topCity + " (" + maxSales + " units) <<<");
        System.out.println("==================================================");
    }} 
