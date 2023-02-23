package class13;

public class stringReCap {
    public static void main(String[] args) {
        // i want to print all the letter from this string one by one
        String str = "Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            //count letter a how many times appear in the above stirng

        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
            System.out.println("letter a has appeared " + count + " many times");

        }
    }
}