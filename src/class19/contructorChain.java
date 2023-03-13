package class19;

public class contructorChain {
    contructorChain(){
        System.out.println("i am non argument constructor");
    }
    contructorChain(String str, int number){
        this(); //making call non argument constructor
        //this() always must be on the first line
        System.out.println(str);
    }
    contructorChain(int number){
        this();
        System.out.println("this is construtor with int prameter");
    }

    public static void main(String[] args) {
        contructorChain obj=new contructorChain("hello",4);

    }
}
