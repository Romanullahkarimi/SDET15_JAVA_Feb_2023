package class26;

public  interface TrustAble {
    int trust();
    String color="black";
   static void method1(){
       System.out.println("hello world");
    }
}
class Bank implements TrustAble{
    @Override
    public int trust() {
        return 0;
    }
}

