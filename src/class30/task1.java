package class30;

import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
       /* Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map*/
        HashMap<Integer, String>company=new HashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Amazon");
        company.put(4,"FireFox");
        company.put(5,"Samsung");
        company.put(6,"Syntax");
        company.put(7,"Nokia");
        System.out.println(company.size());
        company.replace(4,"Apple");
        System.out.println(company);
        company.remove(7);
        System.out.println(company);

    }
}
