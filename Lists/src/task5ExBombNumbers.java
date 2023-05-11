import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task5ExBombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[]arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int specialNumber = arr[0];
        int power = arr[1];

        while (elements.contains(specialNumber)){
            int indexBomb = elements.indexOf(specialNumber);

            if (indexBomb - power >= 0 && indexBomb + power < elements.size()){
                //
                int left = indexBomb - power;
                int right = indexBomb + power;

                for (int i = right; i >= left; i--) {
                    elements.remove(i);
                }
            }else {
                if (indexBomb - power >= 0 && indexBomb + power >= elements.size()){
                    int left = indexBomb - power;
                    int right = elements.size() - 1;

                    for (int i = right; i >= left; i--) {
                        elements.remove(i);
                    }
                }else if (indexBomb - power < 0 && indexBomb + power < elements.size()){
                    int left = 0;
                    int right = indexBomb + power;

                    for (int i = right; i >= left; i--) {
                        elements.remove(i);
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < elements.size(); i++) {
            sum += elements.get(i);
        }
        System.out.println(sum);
    }
}
