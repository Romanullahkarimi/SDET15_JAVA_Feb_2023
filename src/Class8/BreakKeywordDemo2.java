package Class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println("i love weather because temp" + temp);
            } else {
                summer = false;
                System.out.println("it's very hot" + temp);
            }

                temp +=5;

        }


        boolean sum=true;
        for (int i=70;i<100;i++){
            if(sum){
            System.out.println("i love to go outside");

        }else {
                System.out.println("it's very hot");
            }

    }}}