package Class8;

public class NestedLoops7 {
    public static void main(String[] args) {
/*
       for (int i=0;i<=5;i++){
           System.out.print(i+" ");
       }
        for (int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        for (int i=1;i<=5;i++){
            System.out.print(i+" ");
        }*/
        /*  0 1 2 3 4 5
            1 2 3 4 5
            2 3 4 5

         */
/*
       for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*//*012345
        0246810
        03691215
        */

        for (int i=0;i<=5;i++){
            System.out.print(1*i+" ");

            System.out.println();
}
        for (int i=0;i<=5;i++) {
            System.out.print(2 * i + " ");
        }
            System.out.println();
        for (int i =0;i<=5;i++){
            System.out.print(3*i+" ");

        }
    }}