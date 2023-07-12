public class Task5 {
    public static void main(String[] args) {


        for (int i = 2;
             i < 1000000; i++) {
            boolean m = true;
            for (int s = 2; s < i; s++) {
                if (i % s == 0) {
                    m = false;


                    break;
                }


            }
            if (m) {
                System.out.println(i);
            }
        }
    }
}






