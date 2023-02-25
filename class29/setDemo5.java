package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(23);
        numbers.add(23);
        numbers.add(2);
        numbers.add(24);
        numbers.add(22);
        numbers.add(26);
        LinkedHashSet<Integer>integers=new LinkedHashSet<>(numbers);
        System.out.println(integers);
        TreeSet<Integer> integers1=new TreeSet<>(integers);
        System.out.println(integers1);
    }
}
