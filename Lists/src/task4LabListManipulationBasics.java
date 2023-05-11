import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task4LabListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[]arr = input.split(" ");
            String command = arr[0];
            int temp = Integer.parseInt(arr[1]);
            if (command.equals("Add")){
                numbers.add(temp);
            }else if (command.equals("Remove")){
                numbers.remove(temp);
            }else if (command.equals("RemoveAt")){
                numbers.remove(temp);
            }else if (command.equals("Insert")){
                int index = Integer.parseInt(arr[2]);
                numbers.add(index, temp);
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
