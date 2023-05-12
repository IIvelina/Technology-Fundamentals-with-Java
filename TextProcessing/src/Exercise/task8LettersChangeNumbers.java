package Exercise;

import java.util.Scanner;

public class task8LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        //Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz
        //1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
        //before:
        // A /
        //a *
        //after:
        //A -
        //a +
        double totalSum = 0.0;
        StringBuilder num = new StringBuilder("");
        for (int i = 0; i < input.length; i++) {
            String current = input[i];

            num.append(current);

            char firstSymbol = current.charAt(0);
            char lastSymbol = current.charAt(current.length() - 1);
            num.deleteCharAt(0);
            num.deleteCharAt(num.length() - 1);

            double currentNumber = Double.parseDouble(String.valueOf(num));

            double firstResult = firstSum(currentNumber, firstSymbol);
            currentNumber = firstResult;
            double secondResult = secondSum(currentNumber, lastSymbol);



            totalSum += secondResult;

            num.setLength(0);
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double firstSum(double currentNumber, char firstSymbol) {
        double sum = 0.0;
        if (Character.isUpperCase(firstSymbol)) {
            sum = currentNumber / (firstSymbol - 64);
        }
        if (Character.isLowerCase(firstSymbol)) {
            sum = currentNumber * (firstSymbol - 96);
        }
        return sum;
    }

    private static double secondSum(double currentNumber, char lastSymbol) {
        double sum = 0.0;
        if (Character.isUpperCase(lastSymbol)){
            sum = currentNumber - (lastSymbol - 64);
        }
        if (Character.isLowerCase(lastSymbol)){
            sum = currentNumber + (lastSymbol - 96);
        }
        return sum;
    }
}
