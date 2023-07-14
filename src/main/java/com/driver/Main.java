package com.driver;
public class Main {
    public static void main(String[] args) {
        // Create an object of the Product class
        Product p = new Product();

        // Call the product(int x, int y) method
        int result1 = p.product(2, 3);
        System.out.println("Result 1: " + result1);

        // Call the product(int x, int y, int z) method
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Call the product(double x, double y) method
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }

    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
}
