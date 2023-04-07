import java.util.Scanner;

public class task10LabSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            int currentNum = i;
            while (true){
                if (currentNum / 10 ==0){
                    sum += currentNum;
                    break;
                }else {
                    sum += currentNum % 10;
                    currentNum = currentNum /10;
                }
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }
    }
}
