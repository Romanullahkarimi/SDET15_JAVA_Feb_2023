package class22;

public class Animal {
    String  name;
    String color;
    int agae;
    double weight;
    void speak(){
        System.out.println("animal can speak");

    }
    void eat(){
        System.out.println("all the animal eat");
    }

}
class cat extends Animal{
    void speak(){
        System.out.println("meowwwww");
    }


}
class dog extends Animal{

}
class tester extends Animal{
    public static void main(String[] args) {
        cat cat=new cat();
    }
}
