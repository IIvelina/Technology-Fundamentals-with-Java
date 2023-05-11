import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task3LabMergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>numbers = new ArrayList<>();

        int fistSize = numbers1.size();
        int secondSize = numbers2.size();

        if (fistSize >= secondSize){
            for (int i = 0; i < fistSize; i++) {
                int current1 = numbers1.get(i);
                numbers.add(current1);
                while (i < secondSize) {
                    int current2 = numbers2.get(i);
                    numbers.add(current2);
                    break;
                }
            }
        }else {
            for (int i = 0; i < secondSize; i++) {


                int current2 = numbers2.get(i);
                if (i < fistSize){
                    int current1 = numbers1.get(i);
                    numbers.add(current1);
                    numbers.add(current2);
                }else {
                    numbers.add(current2);
                }
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
