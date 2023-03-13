package Class8;

import java.util.Scanner;

public class BreakKeywordDemo {
    public static void main(String[] args) {



        for (int i=0;i<=10;i++){
            System.out.println(i);
            if(i==3){
                break;
            }
            System.out.println("last line in our code");
        }
}
}