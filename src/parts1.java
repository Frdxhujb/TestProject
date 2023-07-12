import java.util.Scanner;

public class parts1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int n = scanner.nextInt();




        for (int j = i + 1; j < n; j++) {
            System.out.println(j);


        }
    }
}
