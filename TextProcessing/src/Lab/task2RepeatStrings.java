package Lab;

import java.util.Scanner;

public class task2RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        for (String word : words) {
            String repeatWord = repeatWord(word, word.length());
            System.out.print(repeatWord);
        }
    }

    /*
    private static String repeatWord(String word, int numberOfRepetitions) {
        String result = "";
        for (int i = 0; i < numberOfRepetitions; i++) {
            result += word;
        }
        return result;
    }

     */
    private static String repeatWord(String word, int numberOfRepetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfRepetitions; i++) {
            result.append(word);
        }
        return result.toString();
    }
}
