package Class12;

public class stringDemo5 {
    public static void main(String[] args) {
         String str="java";
         String str1="JAVA";

         boolean str3=str.equals(str1);
        System.out.println(str3);
        //to skip the lowercase and upper case

        boolean areEqual=str.equalsIgnoreCase(str1);
        System.out.println(areEqual);
    }
}
