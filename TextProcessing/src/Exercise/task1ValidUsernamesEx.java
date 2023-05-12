package Exercise;

import java.util.Scanner;

public class task1ValidUsernamesEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username  : usernames) {
            //ако е валиден го печатаме
            if (isValidUsername(username)){
                System.out.println(username);
            }
        }
    }

    static  boolean isValidUsername (String user){

        if (user.length() < 3 || user.length() > 16){
            return false;
        }
        for (int i = 0; i < user.length(); i++) {
            char currentSymbol = user.charAt(i);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_'){
                return false;
            }
        }
        return true;
    }
}
