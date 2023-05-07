package MethodsLab;

import java.util.Scanner;

public class task5Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        totalPrice(product, quantity);
    }

    private static void totalPrice(String product, int quantity) {
        double coffee = 1.50;
        double water = 1.00;
        double coke = 1.40;
        double snacks = 2.00;

        double price = 0.0;
        if (product.equals("coffee")){
            price = quantity * coffee;
        }else if (product.equals("water")){
            price = quantity * water;
        }else if (product.equals("coke")){
            price = quantity * coke;
        }else if (product.equals("snacks")){
            price = quantity * snacks;
        }
        System.out.printf("%.2f", price);
    }
}