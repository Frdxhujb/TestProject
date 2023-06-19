import java.util.Scanner;

public class Main1 {

    public static void main(String[]args){
        System.out.println("Hello world!");
        Scanner scanner = new Scanner (System.in);
                int n = scanner.nextInt();

                        System.out.println(Integer.toBinaryString(n));
                        int mask = 1;
                        System.out.println(Integer.toBinaryString(mask));
                        mask=~mask;
                        System.out.println(Integer.toBinaryString(mask));
                        System.out.println(n&mask);
                        System.out.println((Integer.toBinaryString(n&mask)));


    }
}
