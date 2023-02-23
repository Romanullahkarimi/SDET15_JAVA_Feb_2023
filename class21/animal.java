



package class21;

public class animal {
    String name;
    String color="Black";

}

class Cat extends animal{
    String color="white";
    int age=10;
    double weight;
    void printColor (){
        String color="white";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }


}