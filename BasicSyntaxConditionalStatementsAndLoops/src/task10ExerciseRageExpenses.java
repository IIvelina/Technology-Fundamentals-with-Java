import java.util.Scanner;

public class task10ExerciseRageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = lostGamesCount / 2;
        double sumHeadset = headsetCount * headsetPrice;

        int mouseCount = lostGamesCount / 3;
        double sumMouse = mouseCount * mousePrice;

        int keyboardCount = lostGamesCount / 6;
        double sumKeyboard = keyboardCount * keyboardPrice;

        int displayCount = lostGamesCount / 12;
        double sumDisplay = displayCount * displayPrice;

        double expensed = sumHeadset + sumMouse + sumKeyboard + sumDisplay;

        System.out.printf("Rage expenses: %.2f lv.", expensed);
    }
}
