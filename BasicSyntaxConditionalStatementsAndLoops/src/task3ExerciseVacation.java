import java.util.Scanner;

public class task3ExerciseVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double studentsFriday = 8.45;
        double studentsSaturday = 9.80;
        double studentsSunday = 10.46;

        double businessFriday = 10.90;
        double businessSaturday = 15.60;
        double businessSunday = 16.00;

        double regularFriday = 15.00;
        double regularSaturday = 20.00;
        double regularSunday = 22.50;

        double price = 0.0;

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        if (type.equals("Students")){
            if (day.equals("Friday")){
                price = studentsFriday * people;
            }else if (day.equals("Saturday")){
                price = studentsSaturday * people;
            }else if (day.equals("Sunday")){
                price = studentsSunday * people;
            }
            if (people >= 30){
                price = price - (0.15 * price);
            }
        }else if (type.equals("Business")){
            if (day.equals("Friday")){
                price = businessFriday * people;
            }else if (day.equals("Saturday")){
                price = businessSaturday * people;
            }else if (day.equals("Sunday")){
                price = businessSunday * people;
            }
            if (people >= 100){
                double priceOnePeople = price / people;
                people = people - 10;
                price = people * priceOnePeople;
            }
        }else if (type.equals("Regular")){
            if (day.equals("Friday")){
                price = regularFriday * people;
            }else if (day.equals("Saturday")){
                price = regularSaturday * people;
            }else if (day.equals("Sunday")){
                price = regularSunday * people;
            }
            if (people >= 10 && people <= 20){
                price = price - (0.05 * price);
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
