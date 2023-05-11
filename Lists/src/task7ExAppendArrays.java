import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task7ExAppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\|+"))
                .collect(Collectors.toList());

       List<String>lastToFirst = new ArrayList<>();

        List<String>result = new ArrayList<>();

        for (int i = elements.size() - 1; i >= 0; i--) {
            lastToFirst.add(elements.get(i));
        }

        for (int i = 0; i < lastToFirst.size(); i++) {
            String[]current = lastToFirst.get(i).split("\\s+");
            for (int j = 0; j < current.length; j++) {
                if (current[j].equals("")){
                    continue;
                }else {
                    result.add(current[j]);
                }
            }
        }

        for (String element : result) {
            System.out.print(element + " ");
        }
    }
}
