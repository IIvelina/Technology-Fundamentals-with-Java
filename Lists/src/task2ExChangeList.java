import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task2ExChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String[]arr = input.split(" ");
            String command = arr[0];
            int element = Integer.parseInt(arr[1]);

            if (command.equals("Delete")){
                if (numbers.contains(element)){
                    numbers.removeAll(Collections.singleton(element));
                }else {
                    input = scanner.nextLine();
                    continue;
                }
            }else if (command.equals("Insert")){
                int position = Integer.parseInt(arr[2]);
                numbers.add(position, element);
            }

            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
