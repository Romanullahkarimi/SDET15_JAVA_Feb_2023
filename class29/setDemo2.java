package class29;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class setDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("kiwi");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("banana");
        System.out.println(fruit);
    }
}
