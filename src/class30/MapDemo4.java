package class30;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> makeUp=new HashMap<>();
        makeUp.put("lipstick",50.5);
        makeUp.put("foundation",55.5);
        makeUp.put("mascara",30.5);
        Set<String> allKey=makeUp.keySet();
        System.out.println(allKey);
        //delete the entries from the map for which the size of key is greater than 7

        allKey.removeIf(x->x.length()>7);
        System.out.println(allKey);
        System.out.println(makeUp);




    }
}
