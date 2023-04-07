import java.util.Scanner;

public class task4LabBackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int total = hour * 60 + minutes + 30;

        int newHour = total / 60;
        int newMinutes = total % 60;

        if (newHour == 24){
            newHour = 0;
            if (newMinutes < 10){
                System.out.printf("%d:0%d", newHour, newMinutes);
            }else {
                System.out.printf("%d:%d", newHour, newMinutes);
            }
        }else {
            if (newMinutes < 10){
                System.out.printf("%d:0%d", newHour, newMinutes);
            }else {
                System.out.printf("%d:%d", newHour, newMinutes);
            }
        }
    }
}
