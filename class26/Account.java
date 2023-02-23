package class26;

public class Account {
 private    double balance;
   private String accountNumber;
   private String type;
 private    String accountTitle;
 public void setAccountNumber(String accountNumber){
     if (accountNumber.length()!=16){
         System.out.println("wrong accont number");
     }else {
         this.accountNumber=accountNumber;
     }
 }
 public void setBalance(double balance){
     if (balance<0){
     System.out.println("negative  balance is not allowed it current account");
 }else {
         this.balance=this.balance+balance;
     }
 }
 public  String getAccountNumber(){
     return accountTitle;
 }


    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;

    }
}
class AccountTester{
    public static void main(String[] args) {
        Account account=new Account(100,"flajei134253","jdgljsalg","dhgls");
        System.out.println(account.getAccountNumber());



    }
}
