import java.util.Scanner;

public class task10LabMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int times = 1; times <= 10; times++) {
            System.out.printf("%d X %d = %d%n", n, times, n*times);
        }
    }
}
