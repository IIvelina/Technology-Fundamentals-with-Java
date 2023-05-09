package Exercise;

import java.util.Scanner;

public class task2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        getNumberOfVowelLetters(input);
    }

    private static void getNumberOfVowelLetters(String input) {
        String[] arr = input.split("");
        int countVowels = 0;
        for (int i = 0; i < arr.length; i++) {
            String current = arr[i];
            char symbol = current.charAt(0);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o'
                    || symbol == 'u' || symbol == 'y' ||
            symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O'
                    || symbol == 'U' || symbol == 'Y') {
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
