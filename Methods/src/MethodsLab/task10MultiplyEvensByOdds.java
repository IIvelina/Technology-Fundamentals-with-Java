package MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class task10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = getMultiplyOfEvensAndOdds(n);
        System.out.println(result);
    }
    private static Integer getMultiplyOfEvensAndOdds(int n){
        n = Math.abs(n);
        String num = String.valueOf(n);
        int[] numbers = Arrays.stream(num.split(""))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenSum += numbers[i];
            }else {
                oddSum += numbers[i];
            }
        }

        return evenSum*oddSum;
    }
}
