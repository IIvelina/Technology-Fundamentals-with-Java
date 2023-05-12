package Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class task5MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();

        BigInteger firstNumber = new BigInteger(n1);
        BigInteger secondNumber = new BigInteger(n2);
        //BigInteger example = new BigInteger(scanner.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));

    }
}
