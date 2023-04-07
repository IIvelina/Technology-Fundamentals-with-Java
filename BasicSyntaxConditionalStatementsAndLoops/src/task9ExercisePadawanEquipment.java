import java.util.Scanner;

public class task9ExercisePadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts  = Double.parseDouble(scanner.nextLine());
        double priceBeltsFree = 0;
        double totalSum = 0;

        double priceLightsabersBreak = priceLightsabers * Math.ceil(countStudents * 0.1 + countStudents);
        if (countStudents >= 6){
            double numBeals = Math.floor(countStudents / 6.0);
            priceBeltsFree = (countStudents - numBeals) * priceBelts;
            totalSum = priceLightsabersBreak + priceRobes*countStudents + priceBeltsFree;
        }else {
            totalSum = priceLightsabersBreak + priceRobes*countStudents + priceBelts * countStudents;
        }


        if (totalSum <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalSum - amountOfMoney);
        }
    }
}
