package class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String>word=new ArrayList<>();
        word.add("cat");
        word.add("java");
        word.add("computer");
        word.add("lava");
        //remove all the element from this list which end with a
    /*    for (String s: word
             ) {
            if(s.endsWith("a")){
                word.remove(s);*/
        for (int i = 0; i <word.size() ; i++) {
            if (word.get(i).endsWith("a")){
                word.remove(i);

        }




        }
    }
}
