import java.util.Arrays;
import java.util.Scanner;

public class task2ExerciseSumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int sum = 0;

        int[]num = Arrays.stream(n.split(""))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
