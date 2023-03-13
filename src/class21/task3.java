package class21;

public class task3 {
   private static void method(String str) {
        System.out.println("methods with one");
    }

   private static void method(String str, String str1) {
        System.out.println("methods with two");
    }

    private static void method(String str, String str1, String str2) {
        System.out.println("methods with three");
    }

    public static void main(String[] args) {
       task3 task3=new task3();
       method("java");
       method("pyton","java");


    }
}