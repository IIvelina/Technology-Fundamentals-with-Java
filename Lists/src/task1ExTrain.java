
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class task1ExTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[]arr = input.split(" ");

            if (arr[0].equals("Add")){
                int num = Integer.parseInt(arr[1]);
                wagons.add(num);
            }else {
                int passengers = Integer.parseInt(arr[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int current = wagons.get(i);
                    if (current + passengers <= capacity){
                        int total = current + passengers;
                        wagons.set(i, total);
                        break;
                    }
                }
            }

           input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
