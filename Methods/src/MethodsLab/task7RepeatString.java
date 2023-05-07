package MethodsLab;

import java.util.Scanner;

public class task7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numberOfRepeat = Integer.parseInt(scanner.nextLine());

        String newInput = repeat(input, numberOfRepeat);

        System.out.println(newInput);
    }
    private static String repeat(String input, int repeatCount){
        String result = "";

        for (int i = 0; i < repeatCount; i++) {
            result += input;
        }
        return result;
    }
}
