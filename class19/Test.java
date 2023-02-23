package class19;

public class Test {
    public static void main(String[] args) {

        bankAcount ba=new bankAcount();
        ba.acountNumber=123446962;
        ba.money=1000;
        ba.deposite();
        System.out.println(ba.acountNumber);
        System.out.println(ba.money);
       // ba.transfer()we can't use inside the parent class

        System.out.println("creating an object");
        checking check=new checking();
        check.acountNumber=223987653;
        check.interast=0;
       check.deposite();
       check.transfer();
       saving save=new saving();
       save.acountNumber=124345324;
       save.money=2388;
       save.profit=100;
       //finish creating SuperSavings object and see which feature available to that class


    }
}
