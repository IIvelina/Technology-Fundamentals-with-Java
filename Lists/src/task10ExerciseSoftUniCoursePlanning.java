import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task10ExerciseSoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> scheduleLessons = Arrays.stream(scanner.nextLine().split("\\,+"))
                .collect(Collectors.toList());

        String input = "";

        while (!"course start".equals(input = scanner.nextLine())) {

            String[] arr = input.split("\\:+");
            String command = arr[0];
            String lesson = arr[1];

            if (command.equals("Add")){

                if (!scheduleLessons.contains(lesson)){
                    scheduleLessons.add(lesson);
                }
            }else if (command.equals("Insert")){
                int index = Integer.parseInt(arr[2]);
                if (!scheduleLessons.contains(lesson)){
                    scheduleLessons.add(index, lesson);
                }
            }else if (command.equals("Remove")){
                if (scheduleLessons.contains(lesson)){
                    scheduleLessons.remove(lesson);
                }
            }else if (command.equals("Swap")){
                String lesson2 = arr[2];
                if (scheduleLessons.contains(lesson) ){
                    if (scheduleLessons.contains(lesson2)) {
                        int index1 = scheduleLessons.indexOf(lesson);
                        int index2 = scheduleLessons.indexOf(lesson2);
                        Collections.swap(scheduleLessons, index1, index2);
                    }
                }
            }else if (command.equals("Exercise")){
                    if (!scheduleLessons.contains(lesson)){
                        scheduleLessons.add(lesson);
                        scheduleLessons.add(lesson + "-Exercise");
                    }else {
                        int index = scheduleLessons.indexOf(lesson);
                        scheduleLessons.add(index+1, lesson + "-Exercise");
                    }
            }

        }
    }
}
