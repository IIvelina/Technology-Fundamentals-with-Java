package Exercise;

import java.util.Scanner;

public class task1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String user : input) {

            boolean isValid = false;

            if (user.length() < 3 || user.length() > 16){
                isValid = false;
                continue;
            }else {
                isValid = true;
            }
            for (int i = 0; i < user.length(); i++) {
                char current = user.charAt(i);

                if (!Character.isLetterOrDigit(current) && current != '-' && current != '_'){
                    isValid = false;
                    break;
                }else {
                    isValid = true;
                }
            }

            if (isValid){
                System.out.println(user);
            }
        }
    }
}
