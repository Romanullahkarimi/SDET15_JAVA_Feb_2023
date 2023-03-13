package class29;

import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
     /*   5)Create an arrayList of even numbers from 1 to 500. Remove any number
        that is divisible by 5 from that arrayList.*/
        ArrayList<Integer>integers=new ArrayList<>();
        for (int i = 2; i <500 ; i+=2) {
            integers.add(i);
        }
        integers.removeIf(x->x%5==0);
        System.out.println(integers);
    }
}
