package class24;

public abstract   class Animal {


    //define the speak eat methods and creating 3 subclasses and override the speak eat methods
  abstract   void speak();

    void eat(){
        System.out.println("animal is eating");
    }
}
class cat extends Animal{
    @Override
    void speak() {
        System.out.println("cat can speak like meoeww");
    }

    @Override
    void eat() {
        System.out.println("cat can eat food");
    }
}
class dog extends Animal{
    @Override
    void speak() {
        System.out.println("dog can bark");
    }

    @Override
    void eat() {
        System.out.println("dog can eat");
    }
}

