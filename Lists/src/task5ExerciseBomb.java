import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task5ExerciseBomb {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

       // List<String> elements = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());

        List<String> elements1 = Arrays.stream(reader.readLine().split(" "))
                .collect(Collectors.toCollection(ArrayList::new));

        Scanner scanner = new Scanner(System.in);


        String b = scanner.nextLine().split("\\s+")[0];
        String p = scanner.nextLine().split("\\s+")[1];
        String bombNumber = reader.readLine().split("\\s+")[0];
        // ако е лист
        //String bombNumber1 = reader.readLine().split("\\s+").get(0);

        int power = Integer.parseInt(bombNumber.split("\\s+")[1]);

        while (elements1.contains(bombNumber)){
            int elementIndex = elements1.indexOf(bombNumber);
            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power ,elements1.size() - 1);

            for (int i = right; i >= left; i--) {
                elements1.remove(i);
            }
        }
        System.out.println(elements1.stream().mapToInt(Integer::parseInt).sum());
    }
}
