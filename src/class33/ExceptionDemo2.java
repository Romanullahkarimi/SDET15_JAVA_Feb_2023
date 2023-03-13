package class33;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
        try {
          System.out.println(10/0);
            String str="jAVA";
            str.charAt(10);


            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException npe) {
            System.out.println("we are trying to access a method on null object");

        }catch (ArithmeticException e){
            System.out.println("some one is trying  to divide by 0 ");
            }


        System.out.println("line6");
        System.out.println("line7");
        System.out.println("line8");


    }
}