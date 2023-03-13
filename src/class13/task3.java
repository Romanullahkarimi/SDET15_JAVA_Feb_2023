package class13;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
       /* 3) Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
*/
        String dadsName="daniel";
        String momsName="Mary";
        String expectation="boy";
        String firsthalf="";
        String secondhalf="";
        if(expectation.equalsIgnoreCase("boy")){
             firsthalf=dadsName.substring(0,dadsName.length()/2);
             secondhalf=momsName.substring(momsName.length()/2);
            System.out.println(firsthalf+secondhalf);
        }else {
            firsthalf=momsName.substring(0,momsName.length()/2);
            secondhalf=dadsName.substring(dadsName.length()/2);
        }
        }
    }

