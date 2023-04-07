import java.util.Scanner;

public class task3ExerciseElevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine()); //17
        int capacityElevator = Integer.parseInt(scanner.nextLine()); //3

        int courses = 0;

        courses = numberOfPeople / capacityElevator;

        if (numberOfPeople % capacityElevator > 0){
            courses++;
        }

        System.out.println(courses);
    }
}
