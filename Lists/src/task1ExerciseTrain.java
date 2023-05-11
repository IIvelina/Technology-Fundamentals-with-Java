import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task1ExerciseTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[]arr = input.split(" ");

            if (arr[0].equals("Add")){
                wagons.add(Integer.parseInt(arr[1]));
            }else {
                int passengers = Integer.parseInt(arr[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (passengers + wagons.get(i) <= maxCapacity){
                        wagons.set(i, passengers + wagons.get(i));
                        break;
                    }else {
                        continue;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer people : wagons) {
            System.out.print(people + " ");
        }
    }
}
