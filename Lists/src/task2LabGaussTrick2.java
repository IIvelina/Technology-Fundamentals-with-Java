import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task2LabGaussTrick2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i <= numbers.size()/2; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1);
            int current = first + last;
            numbers.set(i, current);
            numbers.remove(numbers.size() - 1);
        }
        System.out.println(numbers.toString().replaceAll("\\[|,|\\]", ""));
    }
}
