package Lab;

import java.util.Scanner;

public class task5DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            }else if (Character.isAlphabetic(currentSymbol)){
                letter.append(currentSymbol);
            }else {
                symbol.append(currentSymbol);
            }
        }

        System.out.println(digits);
        System.out.println(letter);
        System.out.println(symbol);
    }
}
