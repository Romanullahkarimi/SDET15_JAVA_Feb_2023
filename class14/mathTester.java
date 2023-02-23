package class14;

import java.util.Scanner;

public class mathTester {
    public static void main(String[] args) {
        Math math=new Math();
        math.add(10,10);
        math.m(10,3,4);
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int result=math.sub(10,5);

        System.out.println(result);
    }
}
