package class23;

public class task1 {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        creditCard creditCard=new creditCard(100,10);
        creditCard.calculateIntrast();

    }
    }
    class  creditCard{
        double balance;
        double intrast;

        public creditCard(double balance, double intrast) {
            this.balance = balance;
            this.intrast = intrast;
        }

        public void  calculateIntrast(){
            System.out.println("intrast"+(balance*intrast)/100);
        }
    }
class visa extends creditCard  {

   public visa(double balance, double intrast){
       super(balance,intrast);
   }

}
class AX extends creditCard{
    AX (double balance, double intrast){
        super(balance,intrast);
    }

    public static void main(String[] args) {
        System.out.println("intrast ");
    }

}
