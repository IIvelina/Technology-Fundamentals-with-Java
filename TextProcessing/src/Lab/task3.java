package Lab;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //StringBuilder firstString = new StringBuilder(scanner.nextLine());
        //StringBuilder secondString = new StringBuilder(scanner.nextLine());

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        //1. дали в този стринг се съдържа думата, която търсим
        //или с contains(който ще ни върне true/false)или с lastIndexOf
        //(ако върне -1 значи нямаме думата, ако върне нещо различно, значи
        // това ще е индекса на първият път, в който срещаме думата)

        while (input.contains(wordToRemove)){

            input = removeOccurrence(input, wordToRemove);

        }
        System.out.println(input);
    }

    private static String removeOccurrence(String input, String wordToRemove) {

        //X X I C E X
        //0 1 2 3 4 5

        int beginIndex = input.indexOf(wordToRemove); // 2

        int endIndex = beginIndex + wordToRemove.length(); //5

        String result = input.substring(0, beginIndex) + input.substring(endIndex);
        return result;
    }
}
