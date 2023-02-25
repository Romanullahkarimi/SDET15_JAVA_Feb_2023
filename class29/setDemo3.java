package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setDemo3 {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("kiwi");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("banana");
        System.out.println(fruit);
    }
}
