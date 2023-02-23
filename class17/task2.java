package class17;

public class task2 {
/*
    2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.

*/
    public   String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();

    }

    public static void main(String[] args) {
        // we are within the same class we dont need to class
        //

    }
}
