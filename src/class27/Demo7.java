package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("fizzy");
        names.add("roman");
        names.add("tarik");
        names.add("urwa");
        names.add("abeera");
        names.add("savo");
        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("fizzy");
        System.out.println(names);
        names.set(3,"sam");
        System.out.println(names.indexOf("roman"));
    }
}
