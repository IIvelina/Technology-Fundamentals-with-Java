import java.util.Scanner;

public class task7LabTheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int priceWeekday0_18 = 12;
        int priceWeekday18_64 = 18;
        int priceWeekday64_122 = 12;

        int priceWeekend0_18 = 15;
        int priceWeekend18_64 = 20;
        int priceWeekend64_122 = 15;

        int priceHoliday0_18 = 5;
        int priceHoliday18_64 = 12;
        int priceHoliday64_122 = 10;


        if (day.equals("Weekday")){
            if (age >= 0 && age <= 18){
                System.out.println(priceWeekday0_18 + "$");
            }else if (age > 18 && age <= 64){
                System.out.println(priceWeekday18_64 + "$");
            }else if (age > 64 && age <= 122){
                System.out.println(priceWeekday64_122 + "$");
            }else {
                System.out.println("Error!");
            }
        }else if (day.equals("Weekend")){
            if (age >= 0 && age <= 18){
                System.out.println(priceWeekend0_18 + "$");
            }else if (age > 18 && age <= 64){
                System.out.println(priceWeekend18_64 + "$");
            }else if (age > 64 && age <= 122){
                System.out.println(priceWeekend64_122 + "$");
            }else {
                System.out.println("Error!");
            }
        }else if (day.equals("Holiday")){
            if (age >= 0 && age <= 18){
                System.out.println(priceHoliday0_18 + "$");
            }else if (age > 18 && age <= 64){
                System.out.println(priceHoliday18_64 + "$");
            }else if (age > 64 && age <= 122){
                System.out.println(priceHoliday64_122 + "$");
            }else {
                System.out.println("Error!");
            }
        }
    }
}
