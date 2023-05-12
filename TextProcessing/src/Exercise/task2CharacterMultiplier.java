package Exercise;

import java.util.Scanner;

public class task2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];

        System.out.println(printResult(first, second));
    }

    private static int printResult(String first, String second) {
int result = 0;
        if (first.length() == second.length()){
            for (int i = 0; i < first.length(); i++) {
                char symbol1 = first.charAt(i);
                char symbol2 = second.charAt(i);
                int current = symbol1 * symbol2;
                result += current;
            }
        }else if (first.length() > second.length()){
            for (int i = 0; i < second.length(); i++) {
                char symbol1 = first.charAt(i);
                char symbol2 = second.charAt(i);
                int current = symbol1 * symbol2;
                result += current;
                if (i == second.length() - 1){
                    for (int j = i; j < first.length() - 1; j++) {
                        int last = first.charAt(j + 1);
                        result += last;
                    }
                }
            }
        }else {
            for (int i = 0; i < second.length(); i++) {
                char symbol1 = first.charAt(i);
                char symbol2 = second.charAt(i);
                int current = symbol1 * symbol2;
                result += current;
                if (i == first.length() - 1){
                    for (int j = i; j < second.length() - 1; j++) {
                        result += second.charAt(j +1);
                    }
                    break;
                }
            }
        }
        return result;
    }
}
