package Class7;

import java.util.Scanner;

public class WhileRecap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean condition=true;
        int number=1;

        while (number<20){
            System.out.println("number is less than 20");
            int user=scan.nextInt();
            if(user>number){
                System.out.println("number is still less than 15");
            }else if (user<number){
                System.out.println("Number is greater than 15 now");

            }else {
                System.out.println("incorrect");
            }
            condition=false;




        }


    }

}
