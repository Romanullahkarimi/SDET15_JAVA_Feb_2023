package class19;

public class bankAcount {//parent class or super calss
    long acountNumber;
    double money;
    void deposite(){
        System.out.println("Deposite methods form bank account class");
    }
}
class checking extends bankAcount{// child calss or sub class or derived calss
    void transfer(){
        System.out.println("Transfer methods from checking class");
    }

    double interast;
}
class saving extends bankAcount{
    double profit;
    void  takeProfit(){
        System.out.println("profit methods from saving class");
    }
}
class superSaving extends saving{
    void superSaving(){
        System.out.println("");
    }
}
