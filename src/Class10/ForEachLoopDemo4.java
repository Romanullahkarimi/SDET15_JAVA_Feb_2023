package Class10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {

        int[] arr = {10, 13, 20, 25, 45, 50};
        //we can't  update the element in  for each loop bc we don't have access to the index;
        System.out.println(Arrays.toString(arr));


    }
}