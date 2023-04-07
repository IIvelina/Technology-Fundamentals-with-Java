import java.util.Scanner;

public class task6LabCharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        String output = String.format("%c%c%c", symbol1, symbol2, symbol3);

        System.out.println(output);
    }
}
