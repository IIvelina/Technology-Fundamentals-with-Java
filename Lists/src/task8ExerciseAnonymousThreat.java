import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task8ExerciseAnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());


        String input = "";

        while (!"3:1".equals(input = scanner.nextLine())){

            String[]data = input.split("\\s+");

            String command = data[0];

            if (command.equals("merge")){
                int startIndex = Integer.parseInt(data[1]);
                int endIndex = Integer.parseInt(data[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }
                if (startIndex > elements.size() - 1){
                    startIndex = elements.size() - 1;
                }
                if (endIndex < 0){
                    endIndex = 0;
                }
                if (endIndex > elements.size() - 1){
                    endIndex = elements.size() - 1;
                }

                String concatElements = String.join("", elements.subList(startIndex, endIndex));

                elements.subList(startIndex, endIndex).clear();

                elements.add(startIndex, concatElements);

            }else if (command.equals("divide")){
                int index = Integer.parseInt(data[1]);
                int partitions = Integer.parseInt(data[2]);

                List<String> result = new ArrayList<>();

                if (index >= 0 && index < elements.size() &&
                partitions >= 0 && partitions <= 100){
                    String element = elements.get(index);

                    if (element.length() % partitions == 0){
                        int portionLength = element.length() / partitions;
                        int count = 0;

                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            for (int j = 0; j < portionLength; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                            result.add(concat);
                        }
                    }else {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";

                            if (i == partitions - 1){
                                for (int j = count; j < element.length(); j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }else {
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }
                            result.add(concat);
                        }
                    }
                    elements.remove(index);
                    elements.addAll(index, result);
                }
                break;
            }
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
