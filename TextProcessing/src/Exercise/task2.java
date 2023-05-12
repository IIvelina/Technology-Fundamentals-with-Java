package Exercise;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split("\\s+");

        String firstChar = input[0];
        String secondChar = input[1];

        int output = characterMultiplier(firstChar, secondChar);
        System.out.println(output);
    }

    private static int characterMultiplier(String firstChar, String secondChar) {
        int sum = 0;

        if (firstChar.length() > secondChar.length()){
            for (int i = 0; i < secondChar.length(); i++) {
                char symbolSecond = secondChar.charAt(i);
                char symbolFirst = firstChar.charAt(i);
                int multiply = symbolFirst * symbolSecond;
                sum += multiply;
            }
            for (int i = secondChar.length(); i < firstChar.length(); i++) {
                char symbolFirst = firstChar.charAt(i);
                sum += symbolFirst;
            }
        }else {
            for (int i = 0; i < firstChar.length(); i++) {
                char symbolSecond = secondChar.charAt(i);
                char symbolFirst = firstChar.charAt(i);
                int multiply = symbolFirst * symbolSecond;
                sum += multiply;
            }
            for (int i = firstChar.length(); i < secondChar.length(); i++) {
                char symbolFirst = secondChar.charAt(i);
                sum += symbolFirst;
            }
        }

        return sum;
    }
}
