import java.lang.reflect.Array;
import java.util.Arrays;


public class Massiv1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int qwer1[] = new int[]{1, 2, 3, 4};
        int qwer2[] = new int[]{5, 6, 7, 8, 9};
        int qwersumma[] = new int[qwer1.length + qwer2.length];

        for (int i = 0; i < qwer1.length; i++) {
            qwersumma[i] = qwer1[i];
        }
        for (int i = 0, j = qwer1.length; i < qwer2.length; i++, j++) {
            qwersumma[j] = qwer2[i];
        }
        System.out.println(Arrays.toString(qwersumma));


    }
}
