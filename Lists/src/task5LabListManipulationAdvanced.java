import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task5LabListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[]arr = input.split(" ");
            String command = arr[0];

            if (command.equals("Contains")){
                int number = Integer.parseInt(arr[1]);
                if (numbers.contains(number)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
            }else if (command.equals("Print")){
                String action = arr[1];
                if (action.equals("even")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }else if (action.equals("odd")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }
                System.out.println();
            }else if (command.equals("Get")){
                String action = arr[1];
                if (action.equals("sum")){
                    int sum = numbers.stream().mapToInt(a -> a).sum();
                    System.out.println(sum);
                }
            }else if (command.equals("Filter")){
                String action = arr[1];
                int number = Integer.parseInt(arr[2]);
                if (action.equals(">=")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) >= number){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }else if (action.equals(">")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) > number){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }else if (action.equals("<=")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) <= number){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }else if (action.equals("<")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) < number){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }
                System.out.println();
            }

            input = scanner.nextLine();
        }
    }
}
