import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task4ExListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>elements = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[] arr = input.split("\\s+");
            String command = arr[0];

            if (command.equals("Add")){
                int number = Integer.parseInt(arr[1]);
                elements.add(number);
            }else if (command.equals("Insert")){
                int number = Integer.parseInt(arr[1]);
                int index = Integer.parseInt(arr[2]);
                if (index >= 0 && index < elements.size()){
                    elements.add(index, number);
                }else {
                    System.out.println("Invalid index");
                }
            }else if (command.equals("Remove")){
                int index = Integer.parseInt(arr[1]);
                if (index >= 0 && index < elements.size()){
                    elements.remove(index);
                }else {
                    System.out.println("Invalid index");
                }
            }else if (command.equals("Shift")){
                String leftOrRight = arr[1];
                int count = Integer.parseInt(arr[2]);
                if (leftOrRight.equals("left")){
                    for (int i = 0; i < count; i++) {
                        int current = elements.get(0);
                        elements.remove(elements.get(0));
                        elements.add(current);
                    }
                }else if (leftOrRight.equals("right")){
                    for (int i = 0; i < count; i++) {
                        int current = elements.get(elements.size() - 1);
                        elements.remove(elements.get(elements.size() - 1));
                        elements.add(0, current);
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer element : elements) {
            System.out.print(element + " ");
        }
    }
}
