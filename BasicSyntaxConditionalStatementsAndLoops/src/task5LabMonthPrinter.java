import java.util.Scanner;

public class task5LabMonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        int month = Integer.parseInt(scanner.nextLine());

        if (month < 1 || month > 12){
            System.out.println("Error!");
        }else {
            System.out.println(months[month - 1]);
        }
    }
}
