import java.util.Scanner;

public class task6ExerciseStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstN = n;
        int sum = 0;
        int current = 1;

        while (n > 0){
            int endN = n % 10;
            for (int i = endN; i > 0; i--) {
                current = i * current;
            }
            sum += current;
            current = 1;
            n = n / 10;
        }
        if (firstN == sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
