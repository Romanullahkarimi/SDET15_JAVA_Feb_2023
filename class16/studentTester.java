package class16;

public class studentTester {
    public static void main(String[] args) {
        student student=new student();
        student.name="roman";
        student.Id="123";
        student.schoolName="syntax";
        student.age=26;
        student.weight=190;

        student student1=new student();
        student1.name="romanullah";
        student1.Id="132";
        student1.schoolName="syntax";
        student1.age=26;
        student1.weight=190;
        System.out.println(  student1.age );
        System.out.println(student.age);
    }

}
