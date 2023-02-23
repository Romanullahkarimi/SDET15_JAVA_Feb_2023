package class19;

public class ThisKeyword {
    int a,b;
    ThisKeyword(int a, int b){
        this.a=a;
        this.b=b;

    }
    public void sum(int a, int b){
        System.out.println("sum of  local variable = "+(a+b));
        System.out.println("sum of instance variable "+this.a+ this.b);
    }
    void hello(){
        System.out.println("hello batch 15");
    }
    void howareyou(){
        System.out.println("how are you batch 15");
    }
    void greating(){
      this.hello();
        this.howareyou();
    }


    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10,20);
        obj.sum(100,300);
        obj.greating();
    }
}
