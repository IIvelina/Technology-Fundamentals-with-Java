package Lab;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");

        StringBuilder builder = new StringBuilder();
        for (String word : arr) {
           String result = repeatString(word);
           builder.append(result);
        }
        System.out.println(builder);

    }

    private static String repeatString(String word) {
        String result = "";
        int length = word.length();
        for (int i = 0; i < length; i++) {
            result+=word;
        }

        return result;
    }
}
