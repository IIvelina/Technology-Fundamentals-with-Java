package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double result = getCalculations(a, operator, b);
        System.out.println(new DecimalFormat("0.####").format(result));
    }
    private static Double getCalculations(int n1, String operator, int n2){
        double result = 0.0;
        if (operator.equals("+")){
            result = n1 + n2;
        }else if (operator.equals("-")){
            result = n1 - n2;
        }else if (operator.equals("*")){
            result = n1 * n2;
        }else if (operator.equals("/")){
            result = n1 * 1.0 / n2 * 1.0;
        }
        return result;
    }
}
