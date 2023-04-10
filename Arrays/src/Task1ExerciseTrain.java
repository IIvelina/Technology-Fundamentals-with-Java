import java.util.Scanner;

public class Task1ExerciseTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[]arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            arr[i] = people;
            sum+=arr[i];
        }
        for (int people : arr) {
            System.out.printf("%d ", people);
        }
        System.out.println();
        System.out.println(sum);
    }
}
