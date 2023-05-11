import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task2LabGaussTrickEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numbers.size()/2;

        for (int i = 0; i < size; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1);

            int sum = first + last;

            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
