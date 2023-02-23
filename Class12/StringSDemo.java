package Class12;

public class StringSDemo {
    public static void main(String[] args) {
        //we are creating an object of the string calss
        String strobj=new String("java");
        //another ways or shorter way
        // mostly this is how we create the object sting class
        String strobj2="java";
        System.out.println(strobj2.length());

        String str="banana";
        int len=str.length()  ;
        System.out.println(len);
        String name="roman ullah";
        if(name.length()>10){
            System.out.println("name can't be more than 10 letters");
        }

    }
}
