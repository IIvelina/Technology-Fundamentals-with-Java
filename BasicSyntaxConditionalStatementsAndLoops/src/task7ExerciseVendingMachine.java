import java.util.Scanner;

public class task7ExerciseVendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0.0;

        while (!input.equals("Start")){
            double current = Double.parseDouble(input);
            if (current == 0.1 || current == 0.2 || current == 0.5 || current == 1 || current == 2){
                money += current;
            }else {
                System.out.printf("Cannot accept %.2f%n", current);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;

        while (!product.equals("End")){
            if (!product.equals("Nuts") && !product.equals("Water") && !product.equals("Crisps")
                    && !product.equals("Soda") && !product.equals("Coke")){
                System.out.println("Invalid product");
                product = scanner.nextLine();
                continue;
            }
            if (money >= nuts && product.equals("Nuts")){
                System.out.println("Purchased Nuts");
                money -= nuts;
            }else if (money >= water && product.equals("Water")){
                System.out.println("Purchased Water");
                money -= water;
            }else if (money >= crisps && product.equals("Crisps")){
                System.out.println("Purchased Crisps");
                money -= crisps;
            }else if (money >= soda && product.equals("Soda")){
                System.out.println("Purchased Soda");
                money -= soda;
            }else if (money >= coke && product.equals("Coke")){
                System.out.println("Purchased Coke");
                money -= coke;
            }else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}
