import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task4ExerciseListOperationsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] arr = input.split("\\s+");
            String command = arr[0];

            if (command.equals("Add")) {
                int number = Integer.parseInt(arr[1]);
                numbers.add(number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(arr[1]);
                int index = Integer.parseInt(arr[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(arr[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")) {
                String type = arr[1];
                int count = Integer.parseInt(arr[2]);
                if (type.equals("left")) {
                    for (int i = 0; i < count; i++) {
                        int first = numbers.get(0);
                        //int last = numbers.get(numbers.size() - 1);
                        numbers.add(first);
                        numbers.remove(0);
                    }
                } else if (type.equals("right")) {
                    //int first = numbers.get(0);
                    int last = numbers.get(numbers.size() - 1);
                    numbers.add(0, last);
                    int lastIndex = numbers.size() - 1;
                    numbers.remove(lastIndex);
                }
            }

            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
