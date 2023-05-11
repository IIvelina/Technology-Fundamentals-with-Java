import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task10ExSoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>lessons = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String[]arr = input.split(":");
            String command = arr[0];
            String lesson = arr[1];

            if (command.equals("Add")){
                if (!lessons.contains(lesson)){
                    lessons.add(lesson);
                }else {
                    input = scanner.nextLine();
                    continue;
                }
            }else if (command.equals("Insert")){
                int index = Integer.parseInt(arr[2]);

                if (index >= 0 && index < lessons.size() && !lessons.contains(lesson)){
                    lessons.add(index, lesson);
                }else {
                    input = scanner.nextLine();
                    continue;
                }
            }else if (command.equals("Remove")){
                if (lessons.contains(lesson)){
                    lessons.remove(lesson);
                    if (lessons.contains(lesson + "-Exercise")){
                        lessons.remove(lesson + "-Exercise");
                    }
                }
            }else if (command.equals("Swap")){
                String secondLesson = arr[2];
                if (lessons.contains(lesson) && lessons.contains(secondLesson)){
                    if (lessons.contains(lesson + "-Exercise") && lessons.contains(secondLesson + "-Exercise")){
                        int firstExIndex = lessons.indexOf(lesson + "-Exercise");
                        int secondExIndex = lessons.indexOf(secondLesson + "-Exercise");
                        Collections.swap(lessons, firstExIndex, secondExIndex);
                    }
                    int firstIndex = lessons.indexOf(lesson);
                    int secondIndex = lessons.indexOf(secondLesson);
                    Collections.swap(lessons, firstIndex, secondIndex);

                    if (lessons.contains(lesson + "-Exercise") && !lessons.contains(secondLesson + "-Exercise")){
                        lessons.remove(lesson + "-Exercise");
                        lessons.add(firstIndex+1, lesson + "-Exercise");
                    }else if (!lessons.contains(lesson + "-Exercise") && lessons.contains(secondLesson + "-Exercise")){
                        lessons.remove(lesson + "-Exercise");
                        lessons.add(secondIndex+1, lesson + "-Exercise");
                    }
                }else {
                    input = scanner.nextLine();
                    continue;
                }
            }else if (command.equals("Exercise")){
                String ex = lesson + "-" + "Exercise";
                if (!lessons.contains(lesson) && !lessons.contains(ex)){
                    lessons.add(lesson);
                    lessons.add(ex);
                }else if (lessons.contains(lesson) && !lessons.contains(ex)){
                    int indexLesson = lessons.indexOf(lesson);
                    lessons.add(indexLesson+1, ex);
                }else {
                    continue;
                }
            }

            input = scanner.nextLine();
        }
        for (int i = 1; i <= lessons.size(); i++) {
            System.out.println(i+"."+lessons.get(i - 1));
        }
    }
}
