import java.util.Scanner;

public class task6ExerciseTriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char first = (char)('a' + i);
                    char second = (char)('a' + j);
                    char third = (char)('a' + k);
                    System.out.printf("%c%c%c%n",first ,second, third );
                }
            }
        } */

        for (char i = 'a'; i < 'a' + n; i++) {
            for (char j = 'a'; j < 'a' + n; j++) {
                for (char k = 'a'; k < 'a' + n; k++) {
                    System.out.printf("%c%c%c", i, j ,k);
                    System.out.println();
                }
            }
        }
    }
}
