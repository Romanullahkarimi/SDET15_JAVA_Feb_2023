package Class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);         // below lines helps us to get input from the keyboard

        System.out.println("what is your first name?");
        String name =scan.next();

        System.out.println("What is your age");
       int age= scan.nextInt();

        System.out.println("what is your senior quotes");
        String quotes = scan.next();

        System.out.println("what is your job");
         String job = scan.next();

        System.out.println("Thank you "+name+" you are "+age+" years old");
        System.out.println("and your senior quotes "+quotes+"and you have to save money "+job);


                //next line is used when we have to take sentence from the keyboard





        {

        }


    }
}
