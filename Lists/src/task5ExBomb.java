import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task5ExBomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        String bomb = data[0];
        int power = Integer.parseInt(data[1]);

        while (elements.contains(bomb)){

            int elementIndex = elements.indexOf(bomb);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);
            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());;
    }
}
