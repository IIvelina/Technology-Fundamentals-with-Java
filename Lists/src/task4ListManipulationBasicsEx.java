import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task4ListManipulationBasicsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
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
                String evenOrOdd = arr[1];
                if (evenOrOdd.equals("odd")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }else if (evenOrOdd.equals("even")){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }
                System.out.println();
            }else if (command.equals("Get")){
                String sum = arr[1];
                if (sum.equals("sum")){
                   int sumNumbers = numbers.stream().mapToInt(e -> e).sum();
                    System.out.println(sumNumbers);
                }
            }else if (command.equals("Filter")){
                String sign = arr[1];
                int number = Integer.parseInt(arr[2]);
                List<Integer>temp = new ArrayList<>();

                if (sign.equals(">")){
                    temp = numbers.stream().filter(e -> e > number).collect(Collectors.toList());
                    for (Integer num : temp) {
                        System.out.print(num + " ");
                    }
                }else if (sign.equals(">=")){
                    temp = numbers.stream().filter(e -> e >= number).collect(Collectors.toList());
                    for (Integer num : temp) {
                        System.out.print(num + " ");
                    }
                }
                else if (sign.equals("<")){
                    temp = numbers.stream().filter(e -> e < number).collect(Collectors.toList());
                    for (Integer num : temp) {
                        System.out.print(num + " ");
                    }
                }else if (sign.equals("<=")){
                    temp = numbers.stream().filter(e -> e <= number).collect(Collectors.toList());
                    for (Integer num : temp) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            }

            input = scanner.nextLine();
        }
    }
}
