package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
      //  HashMap<String,Integer> groceries=new HashMap<>();
      //  LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>();
        TreeMap<String,Integer> groceries=new TreeMap<>();
        groceries.put("eggs",10);
        groceries.put("milk",15);
        groceries.put("bread",4);
        groceries.put("rice",8);
        groceries.put("Meat",12);
        groceries.put("tomatos",10);
        System.out.println(groceries);
      /*  System.out.println(groceries.get("rice"));
        System.out.println(groceries);*/


    }
}
