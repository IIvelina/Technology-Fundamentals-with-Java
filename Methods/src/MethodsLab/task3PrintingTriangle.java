package MethodsLab;

import java.util.Scanner;

public class task3PrintingTriangle {
    public static void main(String[] args) {

        printTriangle();

    }

    public static void printTriangle() {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            printNumber(i);
        }
        for (int i = n-1; i >= 1; i--) {

            printNumber(i);
        }
    }

    private static void printNumber(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

