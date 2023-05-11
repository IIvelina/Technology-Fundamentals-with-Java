import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task2ExerciseChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[]arr = input.split(" ");
            String command = arr[0];
            int element = Integer.parseInt(arr[1]);

            if (command.equals("Delete")){
                list.removeAll(Arrays.asList(element));
            }else if (command.equals("Insert")){
                int index = Integer.parseInt(arr[2]);
                list.add(index, element);
            }
            input = scanner.nextLine();
        }
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
