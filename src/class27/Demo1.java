package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="roman";
        String name1="karim";
        String []names={"roman","khan","jan","baba","nat"};
display(names);

    }
 public static   void display(String [] names){
       for(String name: names){
           System.out.println(name);

        }


    }
    public static void display1(String name, String name1, String name2){
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

    }
}
