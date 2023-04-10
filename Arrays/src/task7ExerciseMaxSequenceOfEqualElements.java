import java.util.Arrays;
import java.util.Scanner;

public class task7ExerciseMaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int counter = 0;
        int winCounter = 0;
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                break;
            }
            if (arr[i] == arr[i+1]){
                counter++;
                if (counter > winCounter){
                    winCounter = counter;
                    number = arr[i];
                }
            }else {
                counter = 0;
            }
        }
        for (int i = 0; i < winCounter + 1; i++) {
            System.out.print(number + " ");
        }
    }
}
