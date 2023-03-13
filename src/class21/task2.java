package class21;

public class task2 {
    static void method(String str) {
        System.out.println("methods with one");
    }

    static void method(String str, String str1) {
        System.out.println("methods with two");
    }

    static void method(String str, String str1, String str2) {
        System.out.println("methods with three");
    }

    public static void main(String[] args) {
       method("java");
       method("pyton","java");


    }
}