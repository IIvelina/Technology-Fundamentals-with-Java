import java.util.*;

public class task6LabListOfProductsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String>products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d.%s%n",i, products.get(i - 1));
        }
    }
}
