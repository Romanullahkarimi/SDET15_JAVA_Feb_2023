package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(1,"nazir");
        student.put(2,"anush");
        student.put(3,"roman");
        student.put(4,"Aisha");

       //remove the key from above map if they are greater than 2
        Set<Integer>keys=student.keySet();
        keys.removeIf(x->x>2);
        System.out.println(student);



    }

}
