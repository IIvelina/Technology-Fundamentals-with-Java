package Exercise;

import java.util.Scanner;

public class task1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        getSmallestNumber(n1, n2, n3);
    }
    private static void getSmallestNumber(int n1, int n2, int n3){
        int result = 0;
        if (n1 <= n2 && n1 <= n3){
            result = n1;
        }else if (n2 <= n1 && n2 <= n3){
            result = n2;
        }else if (n3 <= n1 && n3 <= n2){
            result = n3;
        }
        System.out.println(result);
    }
}
