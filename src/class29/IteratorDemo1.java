package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> number = new ArrayList<>();
        number.add(12.0);
        number.add(2.0);
        number.add(13.0);
        number.add(16.0);
        number.add(18.0);

        //the below one line is important for arrayList
     //   number.removeIf(numbers -> numbers > 11);
        Iterator<Double>iterator=number.iterator();
     /*   System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(number);*/
        //hasNext keep on returning true as long as there are element left to be iteration
        while (iterator.hasNext()) {
            double numbers = iterator.next();
            if (numbers>11){
                iterator.remove();
            }
        }
        System.out.println(number);
    }
}
