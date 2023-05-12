package Exercise;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String encryptedPassword = "";

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            int newSymbol = (int)symbol + 3;
            encryptedPassword += (char)newSymbol;
        }
        System.out.println(encryptedPassword);
    }
}
