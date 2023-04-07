import java.util.Scanner;

public class task9ExerciseSpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int daysCount = 0;
        int sumEndShift = 0;

        while (start >= 100){
            daysCount++;
            int endShift = start - 26;
            sumEndShift += endShift;
            start-=10;
        }
        int totalSpice = 0;
        if (sumEndShift >= 26){
            totalSpice = sumEndShift - 26;
        }else {
            totalSpice = sumEndShift;
        }

        System.out.printf("%d%n%d", daysCount, totalSpice);
    }
}
