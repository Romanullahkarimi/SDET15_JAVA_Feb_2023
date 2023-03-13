package class24;

public class AnimalTester {
    public static void main(String[] args) {
      /*  Animal animal=new Animal();
        animal.eat();*/
        Animal []arr={new cat(),new dog()};
        for (Animal animal:arr){
            animal.speak();
            animal.eat();
        }
    }
}
