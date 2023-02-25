package class29;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {


 /*   /1) Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that/
*/
        ArrayList<String> strings = new ArrayList<>();
        strings.add("roman");
        strings.add("roman");
        strings.add("jan");
        strings.add("roman");
        System.out.println(strings.isEmpty());
        System.out.println(strings.contains("jan"));
        System.out.println(strings.size());

    }
}