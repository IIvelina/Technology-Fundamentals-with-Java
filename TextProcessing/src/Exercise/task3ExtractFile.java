package Exercise;

import java.util.Scanner;

public class task3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        //C:\Internal\training-internal\Template.pptx

        String last = input[input.length - 1];

        String[] parts = last.split("\\.");
        String name = parts[0];
        String extension = parts[1];
        System.out.print("File name: " + name);
        System.out.println();
        System.out.print("File extension: " + extension);
    }
}
