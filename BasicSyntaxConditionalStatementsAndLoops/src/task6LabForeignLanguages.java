import java.util.Scanner;

public class task6LabForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("England") || input.equals("USA")){
            System.out.println("English");
        }else if (input.equals("Spain") || input.equals("Argentina") || input.equals("Mexico") ){
            System.out.println("Spanish");
        }else {
            System.out.println("unknown");
        }
    }
}
