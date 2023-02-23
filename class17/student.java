package class17;

import org.intellij.lang.annotations.Identifier;

public class student {
    String ID;
    String name;
    int Age;
    double wieght;
    public student(String StudentID,String StudentName, int studentAge, double  studentWieght){
        ID=StudentID;
        name=StudentName;
        Age=studentAge;
        wieght=studentWieght;
    }
    void printInfo (){System.out.println("ID"+ID+"Name "+name+" Age"+Age+"Wieght "+wieght);

    }

}
