package Exercise;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String lastExtract = input[input.length - 1];

        String file = lastExtract.split("\\.")[0];

        String extension = lastExtract.split("\\.")[1];

        System.out.printf("File name: %s%nFile extension: %s", file, extension);
    }
}
