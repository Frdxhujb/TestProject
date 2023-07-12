import java.util.Scanner;

public class parts4 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int n = scanner.nextInt();
        int suma = 0;


        for (int j = i; j < n; j++) {
            suma += j;

        }
        System.out.println(suma);


        int step = i - n + 1;
        suma = suma / step ;


    }
}
