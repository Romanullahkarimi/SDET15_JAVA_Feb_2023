package class30;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("apple",1.99);
        fruit.put("orange",2.99);
        fruit.put("banana",3.99);
        fruit.put("mango",4.99);
        fruit.put("Kiwi",0.99);
       fruit.put(null,null);
        System.out.println(fruit);
        HashMap<String, Double>makeUp=new HashMap<>();
        makeUp.put("lipstick",50.5);
        makeUp.put("lipstick",50.5);
        makeUp.put("lipstick",50.5);
        makeUp.put("lipstick",50.5);
        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeUp);
        System.out.println(groceries);
    }
}
