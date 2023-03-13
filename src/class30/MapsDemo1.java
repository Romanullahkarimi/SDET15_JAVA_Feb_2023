package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String>student=new HashMap<>();
        student.put(1,"nazir");
        student.put(2,"anush");
        student.put(3,"roman");
        student.put(4,"Aisha");
        System.out.println(student);
        System.out.println(student.get(2));
        System.out.println(student.size());
        System.out.println(student.containsKey(3));
        System.out.println(student.containsValue("roman"));
        System.out.println(student.remove(1));
        System.out.println(student);
        student.replace(2,"jan");
        System.out.println(student);
    }
}
