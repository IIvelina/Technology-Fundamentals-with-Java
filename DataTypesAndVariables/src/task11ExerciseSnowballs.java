import java.util.Scanner;

public class task11ExerciseSnowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double snowballValue = 0.0;
        int bigSnowballSnow = 0;
        int bigSnowballTime = 0;
        int bigSnowballQuality = 0;

        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double calculate = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (calculate > snowballValue){
                snowballValue = calculate;
                bigSnowballSnow = snowballSnow;
                bigSnowballTime = snowballTime;
                bigSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bigSnowballSnow, bigSnowballTime, snowballValue, bigSnowballQuality);
    }
}
