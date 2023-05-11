import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3ExHouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String>names = new ArrayList<>();



        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            String[]arr = input.split(" ");
            String name = arr[0];
            String goOrNot = arr[2];

            if (goOrNot.equals("going!")){
                if (!names.contains(name)){
                    names.add(name);
                }else {
                    System.out.println(name + " is already in the list!");
                }
            }else if (goOrNot.equals("not")){
                if (names.contains(name)){
                    names.remove(name);
                }else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
