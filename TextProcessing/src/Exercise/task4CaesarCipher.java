package Exercise;

import java.util.Scanner;

public class task4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split("");

        String encrypt = "";

        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            char symbol = current.charAt(0);
            int asciiInt = (int)symbol + 3;
            char newSymbol = (char)asciiInt;
            encrypt+= newSymbol;
        }
        System.out.println(encrypt);
    }
}
