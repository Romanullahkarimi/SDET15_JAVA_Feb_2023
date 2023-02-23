package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 5 numbers");


        //below code manually store numbers in array

        int[]numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=13;
        numbers[3]=50;
        numbers[4]=11;




/*
        numbers[0]=scan.nextInt();
        numbers[1]=scan.nextInt();
        numbers[2]=scan.nextInt();
        numbers[3]=scan.nextInt();
        numbers[4]=scan.nextInt();
*/

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scan.nextInt();


        }

        System.out.println(Arrays.toString(numbers));
    }
}