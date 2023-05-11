import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task7AppendArraysEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.stream(scanner.nextLine().split("\\|+"))
        .filter(el -> !el.matches("\\s+"))
        .map(e -> Arrays.stream(e.split("\\s+"))
        .filter(el -> !el.equals(""))
        .collect(Collectors.toList()))
        .collect(Collectors.collectingAndThen(Collectors.toList(),
                strings -> {
            Collections.reverse(strings);
            return strings;
                }))
        .toString().replaceAll("[\\[\\],]", ""));

    }
}
