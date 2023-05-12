package Exercise;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String userName : input) {
            boolean valid = check(userName);
            if (valid){
                System.out.println(userName);
            }

        }
    }

    private static boolean check(String userName) {
        boolean isValid = false;
        if (userName.length() >= 3 && userName.length() <= 16){
            isValid = true;
            for (int i = 0; i < userName.length(); i++) {
                char symbol = userName.charAt(i);
                if (Character.isLetterOrDigit(symbol) || symbol == '_' || symbol == '-'){
                    isValid = true;
                }else {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
}



