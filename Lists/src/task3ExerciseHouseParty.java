import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3ExerciseHouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String>names = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            String command = input[2];

            if (command.equals("going!")){
                if (names.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    names.add(name);
                }
            }else if (command.equals("not")){
                if (names.contains(name)){
                    names.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }

        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
