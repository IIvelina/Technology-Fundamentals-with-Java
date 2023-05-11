import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task6ExerciseCardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> handsCardOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> handsCardSecond = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true){

            for (int i = 0; i < handsCardOne.size(); i++) {
                int currentOne = handsCardOne.get(i);
                int currentSecond = handsCardSecond.get(i);


                if (currentOne == currentSecond){
                    handsCardOne.remove(0);
                    handsCardSecond.remove(0);
                }else if (currentOne > currentSecond){

                    handsCardOne.add(currentOne);
                    handsCardOne.add(currentSecond);

                    handsCardOne.remove(0);
                    handsCardSecond.remove(0);

                }else if (currentSecond > currentOne){

                    handsCardSecond.add(currentSecond);
                    handsCardSecond.add(currentOne);

                    handsCardSecond.remove(0);
                    handsCardOne.remove(0);

                }
                if (handsCardOne.isEmpty() || handsCardSecond.isEmpty()){
                    if (handsCardOne.isEmpty()){
                        System.out.print("Second player wins! Sum: ");
                        System.out.print(handsCardSecond.stream().mapToInt(a->a).sum());
                    }else {
                        System.out.print("First player wins! Sum: ");
                        System.out.print(handsCardOne.stream().mapToInt(a -> a).sum());
                    }
                    return;
                }else {
                    i = -1;

                }
            }
        }

    }
}
