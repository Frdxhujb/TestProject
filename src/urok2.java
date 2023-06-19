import java.util.Scanner;

public class urok2 {
    public static void main(String[] args) {
        System.out.print("Введите время часах:");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        if (11 <= hour && 19 >= hour) {
            System.out.println("Добрый день");
        }else if (20 >= hour && 5 <= hour) {
            System.out.println("Добро ночи");


        }
        else if (10 <= hour && 6 >= hour) {
            System.out.println("Доброе утро");

        }
    }
}

