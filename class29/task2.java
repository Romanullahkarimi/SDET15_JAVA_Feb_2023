package class29;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
      //  2)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW xi");
        cars.add("tesla y");
        cars.add("fx");
        System.out.println(cars);
        for (String car:cars){
            System.out.println(car);
        }


    }

}
