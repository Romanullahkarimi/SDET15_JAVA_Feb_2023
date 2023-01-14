package Class8;

import java.util.Scanner;

public class LoopsWithString {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name");

        while (scan.next().equalsIgnoreCase("roman")){
            System.out.println("great student who always listen to teacher");
        }
}
}