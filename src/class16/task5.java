package class16;

public class task5 {

    //5) Write a method to return whether given number is prime or not?
    //return type =>boolean
    // name=>prime
    //parameter=>int number
    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1)
            for (int i = 0; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }

            }
        return flag;

    }

    public static void main(String[] args) {
        task5 LG=new task5();
        System.out.println(LG.isPrime(12));
    }





            }
