package Class12;

public class stringDemo7 {
    public static void main(String[] args) {

        String str=" i love java";
        boolean startWith=str.startsWith(" i love");
        System.out.println(startWith);
        System.out.println(str.endsWith("java"));

        //method changing is when multipule method are called on te same line

        System.out.println(str.toLowerCase().startsWith(" i"));


        System.out.println(str.contains("java"));


    }
}
