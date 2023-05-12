package Lab;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String word : words) {
         if (input.contains(word)) {
             StringBuilder wordsOfStar = new StringBuilder();
             for (int i = 0; i < word.length(); i++) {
                 wordsOfStar.append("*");
             }
             input = input.replace(word, wordsOfStar);
         }
        }
        System.out.println(input);
    }
}
