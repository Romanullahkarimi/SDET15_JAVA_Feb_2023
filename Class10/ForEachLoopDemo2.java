package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int[] arr = {10, 13, 20, 25, 45, 50};
        arr[1] = 0;//this is how to updates a single element in an array
        //print add number
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        //replace all odd numbers in  this array with the help of a normal loop
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }

        }
    }

}
