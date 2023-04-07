import java.util.Scanner;

public class task11Lab1MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startTimes = Integer.parseInt(scanner.nextLine());

        if (startTimes > 10){
            System.out.printf("%d X %d = %d", number, startTimes, number * startTimes);
        }

        for (int i = startTimes; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", number, i, number * i);
        }
    }
}
