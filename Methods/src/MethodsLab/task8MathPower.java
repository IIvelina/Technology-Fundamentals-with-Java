package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = numberAfterPower(number, power);

        System.out.println(new DecimalFormat("0.#####").format(result));
    }
    private static Double numberAfterPower(double n, int power){
        double result = Math.pow(n, power);
        return result;
    }
}
