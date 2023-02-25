package class29;

import java.util.TreeSet;

public class taskSet1 {
    public static void main(String[] args) {
     /*   Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order. Using
    2 different ways retrieve all elements from set.*/
        TreeSet<String>country=new TreeSet<>();
        country.add("afghanistan");
        country.add("india");
        country.add("USA");
        country.add("UAE");
        //first way
        System.out.println(country);
        //second way
        for (String s:country){
            System.out.println(s);
        }

    }
}
