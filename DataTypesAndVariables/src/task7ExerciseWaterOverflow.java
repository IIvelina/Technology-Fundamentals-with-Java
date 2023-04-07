import java.util.Scanner;

public class task7ExerciseWaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTankCapacity = 255;

        int number = Integer.parseInt(scanner.nextLine());

        int sumWater = 0;

        for (int i = 0; i < number; i++) {
            int water = Integer.parseInt(scanner.nextLine());

            if (water <= waterTankCapacity){
                waterTankCapacity -= water;
                sumWater += water;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumWater);
    }
}
