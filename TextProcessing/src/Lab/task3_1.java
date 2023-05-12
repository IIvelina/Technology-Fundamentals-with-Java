package Lab;

import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String input = scanner.nextLine();


        while (input.contains(word)) {
            input = input.replaceAll(word, "");
        }
        System.out.println(input);
    }
}
