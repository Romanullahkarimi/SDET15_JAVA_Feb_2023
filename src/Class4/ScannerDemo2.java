package Class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scan.next();

        System.out.println("what is your age");
        int age = scan.nextInt();
        System.out.println("are you tired");
        boolean tired=scan.nextBoolean();
        System.out.println("thank you "+name+" you are "+age  +" years old");
        System.out.println("you are feeling "+tired);






    }
}
