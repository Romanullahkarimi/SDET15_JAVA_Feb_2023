package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        LinkedList<String> numbers=new LinkedList<>();
        for (int i = 0; i <10000; i++) {
            numbers.add(0,"test data");
            long endtime=System.currentTimeMillis();
            System.out.println(endtime-startTime);

        }

    }
}
