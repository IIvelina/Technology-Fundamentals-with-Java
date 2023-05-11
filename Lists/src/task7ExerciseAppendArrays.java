import java.util.*;
import java.util.stream.Collectors;

public class task7ExerciseAppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(elements);

        List<String>list = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            String[] current = elements.get(i).split("\\s+");

            for (int j = 0; j < current.length; j++) {
                String currentEl = current[j];
                if (currentEl.equals("")){
                    continue;
                }else {
                    list.add(currentEl);
                }
            }
        }

        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
