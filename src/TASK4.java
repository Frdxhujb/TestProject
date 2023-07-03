public class TASK4 {
    public static void main(String[] args) {
        int i = 0;
        int x = 1;
        int y ;
        while (i < 10000000) {
            y=i+x;
            x=i;
            i=y;
            if (i < 10000000){

            System.out.println(y);}

        }

        }


    }
