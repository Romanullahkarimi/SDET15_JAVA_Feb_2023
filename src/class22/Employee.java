package class22;

public class Employee {
    String name;
 static        int baseSalary=10000;
   static int baseHoliday=10;
    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHolidays(){
        System.out.println(baseHoliday);
    }
}
class officeBoys extends Employee{

}
class manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*4)+2000);
    }
}
class developer extends Employee{
    void printSalary(){
        System.out.println((baseSalary*3)+3000);
    }
}
class QA extends Employee{
    void printSalary(){
        System.out.println((baseSalary*4)+2000);
    }
}


