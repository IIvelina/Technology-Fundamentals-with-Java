package Lab;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String reverse = reverseString(input);
            System.out.printf("%s = %s%n", input, reverse);
            input = scanner.nextLine();
        }
    }

    private static String reverseString(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            char symbol = input.charAt(i);
            reverse += symbol;
        }
        return reverse;
    }
}
