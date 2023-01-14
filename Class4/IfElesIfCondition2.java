package Class4;

import java.util.Scanner;

public class IfElesIfCondition2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("will be the weather cold tomorrow? ");

        boolean rain= scan.nextBoolean();
        if(rain){
            System.out.println("let's make party at Guestroom");
        }
        else{
            System.out.println("let's play foodball");
        }
    }
}
