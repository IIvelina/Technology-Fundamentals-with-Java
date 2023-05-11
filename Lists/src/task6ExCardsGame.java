import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task6ExCardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>firstHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer>secondHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < firstHand.size(); i++) {
            int first = firstHand.get(i);
            int second = secondHand.get(i);

            if (first > second){
                firstHand.remove(0);
                secondHand.remove(0);
                firstHand.add(first);
                firstHand.add(second);
            }else if (first < second){
                firstHand.remove(0);
                secondHand.remove(0);
                secondHand.add(second);
                secondHand.add(first);
            }else {
                firstHand.remove(0);
                secondHand.remove(0);
            }
            i = -1;
            if (firstHand.isEmpty() || secondHand.isEmpty()){
                if (firstHand.isEmpty()){
                    int sumSecond = secondHand.stream().mapToInt(e -> e).sum();
                    System.out.printf("Second player wins! Sum: %d", sumSecond);
                    return;
                }else {
                    int sumFirst = firstHand.stream().mapToInt(e -> e).sum();
                    System.out.printf("First player wins! Sum: %d", sumFirst);
                    return;
                }
            }
        }
    }
}
