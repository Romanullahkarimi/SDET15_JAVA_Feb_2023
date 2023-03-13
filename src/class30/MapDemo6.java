package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(1,"nazir");
        student.put(2,"anush");
        student.put(3,"roman");
        student.put(4,"Aisha");
        Collection<String>value=student.values();
        System.out.println(value);
        value.removeIf(x->x.contains("i"));
        value.removeIf(x->x.length()>2);
        System.out.println(value);
        System.out.println(student);

    }
}
