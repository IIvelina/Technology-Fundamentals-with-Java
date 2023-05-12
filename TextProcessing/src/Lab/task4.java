package Lab;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String character = "";
        String digit = "";
        String letter = "";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isLetter(current)){
                letter+=current;
            }else if (Character.isDigit(current)){
                digit+=current;
            }else {
                character+=current;
            }
        }
        System.out.printf("%s%n%s%n%s", digit, letter, character);
    }
}
