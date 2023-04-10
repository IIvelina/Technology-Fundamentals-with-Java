import java.util.Arrays;
import java.util.Scanner;

public class task4ExerciseArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            if (arr.length == rotations){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");

                }
                return;
            }else { // 51 47 32 61 21
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1]; //47

                    if (j == arr.length - 2){
                        arr[arr.length - 1] = temp;
                        break;
                    }
                }

            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
