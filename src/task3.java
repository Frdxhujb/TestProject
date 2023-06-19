import java.util.Scanner;

public class task3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int mask = 1;
        mask = mask << i;
        n=n|mask;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }
}
