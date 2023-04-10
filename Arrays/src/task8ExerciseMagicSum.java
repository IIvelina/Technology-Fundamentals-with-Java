import java.util.Arrays;
import java.util.Scanner;

public class task8ExerciseMagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int current = arr[j];
                if (temp + current == n){
                    System.out.print(temp + " " + current);
                    System.out.println();
                }
            }
        }
    }
}
