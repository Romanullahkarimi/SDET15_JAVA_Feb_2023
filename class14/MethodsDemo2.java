package class14;

import java.util.Scanner;

public class MethodsDemo2 {
        //defining a method
        void printHello(){
                System.out.println("hello wold");
                System.out.println("hello wold");
                System.out.println("hello wold");
                System.out.println("hello wold");
        }
        //below is easiest way of do the same task
        void printHelloManyTimes(int times){
                for (int i = 0; i < times; i++) {
                        System.out.println("hello");

                }
        }
        void printManyTimes(int times,String word){

                for (int i = 0; i < times; i++) {
                        System.out.println(word);

                }
        }



}




