import java.util.*;
import java.util.stream.Collectors;

public class task7LabRemoveNegativesAndReverseEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers = numbers.stream().filter(e -> e > 0).collect(Collectors.toList());
        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
