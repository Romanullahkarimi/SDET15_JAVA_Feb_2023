package Class12;

public class stringDemo8 {
    public static void main(String[] args) {

        String str="i love java";
        char c=str.charAt(0);
        System.out.println(c);
        for (int s = 0; s <str.length() ; s++) {
            System.out.println(str.charAt(s));

        }
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                System.out.println(counter);
            }

        }

    }
}
