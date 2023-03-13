package class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class task2 {
  /*  Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/
  public static void main(String[] args) {
      Map<String, String> countries = new TreeMap<>();
      countries.put("Morocco", "Rabat");
      countries.put("USA", " Washington, D.C");
      countries.put("India", "New Delhi");
      countries.put("France", "Paris");
    //  Set<Map.Entry<String,String>> entrySet=countries.entrySet();
     var entrySet=countries.entrySet();
     for (var a: entrySet){
         System.out.println(a.getKey()+" "+a.getValue());
     }
      Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
      while (iterator.hasNext()) {
          Map.Entry<String, String> entry = iterator.next();
          System.out.println(entry.getKey() + " " + entry.getValue());

      }
  }
}

