package class16;

public class task1 {
/*    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/
    String empID;
    int salary;
   static String CEO="sumair";//is going to be same we create this one as static

      void printInfo(){//when we hava different value we hava to use void instance
          System.out.println(empID);
          System.out.println(CEO);
    }

    public static void main(String[] args) {
        task1 syntaxEmployee=new task1();
        syntaxEmployee.empID="123";
        syntaxEmployee.salary=1231;
        System.out.println(syntaxEmployee.empID);

    }
}
