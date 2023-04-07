import java.util.Scanner;

public class task8ExerciseBeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String big = "";
        double maxVolume = 0.0;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (maxVolume < volume){
                maxVolume = volume;
                big = model;
            }
        }
        System.out.println(big);
    }
}
