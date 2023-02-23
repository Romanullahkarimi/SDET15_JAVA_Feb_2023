package class20;

public class BaseClass {
    String name="roman";
    void hello(){
        System.out.println("hello method from BaseClass");
    }
}
class Child extends BaseClass{
    String name="karimi";
    void callMe(){
        System.out.println(name);
        System.out.println(super.name);

    }
    void hello(){
        System.out.println("hello method from child class");
    }
    void callingParentMethod(){
        hello();
       super.hello();
    }
}
