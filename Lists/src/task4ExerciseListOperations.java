import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task4ExerciseListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[]arr = input.split("\\s+");
            String command = arr[0];

            if (command.equals("Add")){
                int number = Integer.parseInt(arr[1]);
                numbers.add(number);
            }else if (command.equals("Insert")){
                int number = Integer.parseInt(arr[1]);
                int index = Integer.parseInt(arr[2]);
                if (index >= 0 && index < numbers.size()){
                    numbers.add(index, number);
                }else {
                    System.out.println("Invalid index");
                    input = scanner.nextLine();
                    continue;
                }
            }else if (command.equals("Remove")){
                int index = Integer.parseInt(arr[1]);
                if (index >= 0 && index < numbers.size()){
                    numbers.remove(index);
                }else {
                    System.out.println("Invalid index");
                    input = scanner.nextLine();
                    continue;
                }
            }else if (command.equals("Shift")){
                String type = arr[1];
                int count = Integer.parseInt(arr[2]);
                if (type.equals("left")){
                    List<Integer>temp = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        temp.add(i, numbers.get(i));
                    }
                    numbers.removeAll(temp);
                    for (int i = 0; i < count; i++) {
                        int current = temp.get(i);
                        numbers.add(current);
                    }

                }else if (type.equals("right")){
                    List<Integer>temp = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        temp.add(0, numbers.get(numbers.size() - 1));
                    }
                    numbers.removeAll(temp);
                    for (int i = 0; i < count; i++) {
                        int current = temp.get(i);
                        numbers.add(i, current);
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
