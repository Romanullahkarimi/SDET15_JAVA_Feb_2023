package class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo9 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");
        //  Set<Map.Entry<String,String>> entrySet=countries.entrySet();
        var entrySet = countries.keySet();
        for (var vlaue : entrySet) {
            System.out.println(vlaue);
        }

    }
}



