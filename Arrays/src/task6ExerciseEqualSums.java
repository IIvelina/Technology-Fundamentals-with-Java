import java.util.Arrays;
import java.util.Scanner;

public class task6ExerciseEqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum){
                System.out.println(i);
                isFound = true;
            }
        }
        if (!isFound){ // ако е false
            System.out.println("no");
        }
    }
}
