import java.util.Arrays;
import java.util.Scanner;

public class Task5ExerciseTopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int top = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int current = arr[j];
                if (first > current){
                    top = first;
                }else {
                    top = 0;
                    break;
                }
            }
            if (top == 0){
                continue;
            }else {
                System.out.print(top + " ");
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}
