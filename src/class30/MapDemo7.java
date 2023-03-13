package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(1,"nazir");
        student.put(2,"anush");
        student.put(3,"roman");
        student.put(4,"Aisha");
        Set<Entry<Integer,String>>entrySet=student.entrySet() ;
        for (Entry<Integer,String>entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);
        System.out.println(student);

    }
}
