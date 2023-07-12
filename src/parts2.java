import java.util.Scanner;

public class parts2 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int n = scanner.nextInt();
        if (n < i) {
            System.out.println("ошибка");

            int j;
            j = n;
            n = i;
            i = j;
        }

        for (int j = i + 1; j < n; j++) {
            if (j % 2 == 0) {
                System.out.println(j);


            }
        }
    }
}


