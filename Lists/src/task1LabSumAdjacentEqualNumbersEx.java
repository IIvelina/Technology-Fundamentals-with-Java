import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task1LabSumAdjacentEqualNumbersEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double current = numbers.get(i);
            double temp = numbers.get(i + 1);



            if (current == temp){
                double sum = current + temp;
                numbers.set(i, sum);
                numbers.remove(numbers.get(i + 1));
                i = -1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.#");
        for (Double number : numbers) {
            System.out.print(df.format(number) + " ");
        }
    }
}
