package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("roman");
        linkedList.add("karim");
        linkedList.add("jan");
        linkedList.add("khan");
        System.out.println(linkedList);
        for(String s:linkedList){
            System.out.println(s);
        }
    }
}
