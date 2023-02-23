package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
      int num=  scan.nextInt();
        System.out.println("another line of code"+num);


        Methods Methods=new Methods();
        String c= Methods.metod2();
    }
}
