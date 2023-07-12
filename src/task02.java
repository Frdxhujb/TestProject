import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();


        for (int i = 0; i < a; i++) {

            {
                System.out.println();
            }

            for (int j = 0; j < a; j++) {
                if (i == 0 || j == 0 || a - 1 == j || a - 1 == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }


            }


        }
        System.out.println();

    }
}


