import java.util.Arrays;
import java.util.Scanner;

public class task7LabCondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        if (arr.length == 1){
            System.out.println(arr[0]);
            return;
        }

        while (arr.length > 2){
            int[] condensed = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                condensed[i] = arr[i] + arr[i + 1];
            }
            arr = condensed;

        }
        System.out.println(arr[0] + arr[1]);
    }
}
