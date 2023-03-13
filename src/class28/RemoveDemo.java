package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>();
        word.add("cat");
        word.add("java");
        word.add("computer");
        word.add("lava");
        var c='s';

  /*      Iterator<String>iterator= word.iterator();
        while (iterator.hasNext()){
        String s=iterator.next();
        if (s.endsWith("a")){
            iterator.remove();
        }}*/
        word.removeIf(s -> s.endsWith("a"));

        System.out.println(word);
    }


}
