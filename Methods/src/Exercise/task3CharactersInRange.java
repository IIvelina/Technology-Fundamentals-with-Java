package Exercise;

import java.util.Scanner;

public class task3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);

        getCharactersBetweenStartAndEnd(startSymbol, endSymbol);
    }
    private static void getCharactersBetweenStartAndEnd(char c1, char c2){
        if (c1 < c2) {
            for (char i = c1; i < c2; i++) {
                if (i == c1) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
        }else {
            for (char i = c2; i < c1; i++) {
                if (i == c2) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
