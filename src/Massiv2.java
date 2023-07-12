import java.util.Arrays;


public class Massiv2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int qwer1[] = new int[]{9, 6, 3, 1, 5, 0};
        int qwer2[] = new int[]{5, 6, 8, 5, 9, 2};
        int qwersumma[];
//        boolean x = false;
//        int b = 0;
//        for (int p = 0; p < qwer2.length; p++)
//            if (qwer1[b] == qwer2[p] && !x) {
//                x = true;
//                continue;


                if (qwer1.length > qwer2.length) {
                    qwersumma = new int[qwer2.length];
                } else {
                    qwersumma = new int[qwer1.length];
                }
                int z = 0;


                for (int i = 0; i < qwer1.length; i++) {


                    for (int j = 0; j < qwer2.length; j++) {
                        if (qwer1[i] == qwer2[j]) {
                            for (int s =0; s<qwersumma.length;s++){
                                if (qwersumma [s] ==qwer1
                                }


                        }

                        qwersumma[z] = qwer1[i];
                        z++;
                    }


                }

            }

        int m[] = new int[z];
        System.arraycopy(qwersumma, 0, m, 0, z);
        System.out.println(Arrays.toString(m));
    }
}


