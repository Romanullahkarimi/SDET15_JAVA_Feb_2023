package Class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[]arr={1,2,4,5,6,};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            System.out.println(arr[1]+" "+arr[4]);

        }
        System.out.println("$$$$$$$$$$$$$$$$$$$");
            //enhanced for loops
            for (int number: arr) {
                System.out.println(number);

            }

        }


    }
