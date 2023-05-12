package Lab;

import java.util.Scanner;

public class task1ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String reverse = reverse(input);

            System.out.printf("%s = %s%n", input, reverse);

            input = scanner.nextLine();
        }
    }
    public static String reverse(String wordCurrent){
        String word = wordCurrent;
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
