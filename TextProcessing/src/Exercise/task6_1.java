package Exercise;

import java.util.Scanner;

public class task6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < input.length() - 2; i++) { //aabbcccd
            char symbol1 = input.charAt(i);
            if (i < input.length() - 2) {
                char symbol2 = input.charAt(i + 1);
                if (symbol1 != symbol2){
                    output.append(symbol1);
                }
            }


        }
        char sym1 = input.charAt(input.length() - 1);
        char sym2 = input.charAt(input.length() - 2);
        char lastOutput = output.charAt(output.length() - 1);

        if (lastOutput != sym2){
            output.append(sym2);
        }
        lastOutput = output.charAt(output.length() - 1);
        if (lastOutput != sym1){
            output.append(sym1);
        }
        System.out.println(output);
    }
}
