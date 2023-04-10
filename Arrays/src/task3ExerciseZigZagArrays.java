import java.util.Scanner;

public class task3ExerciseZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] current = scanner.nextLine().split(" ");
            int first = Integer.parseInt(current[0]);
            int second = Integer.parseInt(current[1]);
            if (i % 2 != 0){
                arr1[i] = first;
                arr2[i] = second;
            }else {
                arr1[i] = second;
                arr2[i] = first;
            }
        }

        for (int secondArr : arr2) {
            System.out.print(secondArr + " ");
        }

        System.out.println();

        for (int firstArr : arr1) {
            System.out.print(firstArr + " ");
        }

    }
}
