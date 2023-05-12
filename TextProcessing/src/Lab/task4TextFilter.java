package Lab;

import java.util.Scanner;

public class task4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String word : words) {
            if (input.contains(word)){
                String wordOfStar = connvertWordToStar(word);
                input = input.replace(word, wordOfStar);
            }
        }
        System.out.println(input);
    }

    private static String connvertWordToStar(String word) {
        StringBuilder wordOfStars = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            wordOfStars.append("*");
        }
        return wordOfStars.toString();
    }
}
