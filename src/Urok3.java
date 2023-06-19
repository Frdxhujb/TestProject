import java.util.Scanner;

public class Urok3 {
    public static void main(String[] args) {
        System.out.print("Выбери голос животного(Кошка-1,Собака-2,Лев-3,Змея-4,Свинья-5,Курица-6,Орёл-7,Медведь-8,Бык-9,Петух-10)");
        Scanner scanner = new Scanner(System.in);
        int voice = scanner.nextInt();
        switch (voice) {
            case 1:

                System.out.println("Мяуконье");
                break;
            case 2:
                System.out.println("Лай");
                break;
            case 3:
                System.out.println("Рык");
                break;
            case 4 :
                System.out.println("Шипение");
                break;
            case 5:
                System.out.println("Хрюканье");
                break;
            case 6:
                System.out.println("Кудахтанье");
                break;
            case 7:
                System.out.println("Клёкот");
                break;
            case 8:
                System.out.println("Рычание");
                break;
            case 9:
                System.out.println("Мычание");
                break;
            case 10:
                System.out.println("Кукареконье");

        }
    }
}
