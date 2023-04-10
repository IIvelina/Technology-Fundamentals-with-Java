import java.util.Scanner;

public class task3ExerciseCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]arr1 = scanner.nextLine().split(" ");
        String[]arr2 = scanner.nextLine().split(" ");

        for (int i = 0; i < arr2.length; i++) {
            String current = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (current.equals(arr1[j])){
                    System.out.print(current + " ");
                }
            }
        }
    }
}
