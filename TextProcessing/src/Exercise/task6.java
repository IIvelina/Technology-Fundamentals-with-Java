package Exercise;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String newString = "";

        for (int i = 0; i < input.length() - 2; i++) {
            char symbol = input.charAt(i);
            if (symbol == input.charAt(i + 1)){
                continue;
            }else {
                newString += symbol;
            }
        }
        char lastInput = input.charAt(input.length() - 1);
        char lastNewString = input.charAt(input.length() - 1);

        if (lastNewString == lastInput){
            newString += lastInput;
        }
        System.out.println(newString);
    }
}
