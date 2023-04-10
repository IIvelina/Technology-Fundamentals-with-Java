import java.util.Scanner;

public class task4LabReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]arr = scanner.nextLine().split(" ");

        String[]reverse = new String[arr.length];


        for (int i = 0; i < arr.length/2; i++) {
            String first  = arr[i];
            String last = arr[arr.length - i - 1];
            String temp = first;

            reverse[i] = last;
            reverse[reverse.length - i - 1] = first;
        }

        if (arr.length % 2 != 0){
            String symbol = arr[arr.length/2];
            reverse[reverse.length/2] = symbol;
        }

        for (String symbol : reverse) {
            System.out.print(symbol + " ");
        }
    }
}
