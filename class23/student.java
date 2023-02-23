package class23;

public class student {
  /*  Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism*/
  public void study(){
    System.out.println("study.............");
  }
  void doHomework(){
    System.out.println("solaving homework");
  }
  void practice(){
    System.out.println("practicing  the skill");
  }

    class subClass extends student {

    @Override
      public void study() {
        System.out.println("study.............");
      }
      @Override

      void doHomework() {
        System.out.println("solaving homework");
      }

      @Override
      void practice() {
        System.out.println("practicing  the skill");


      }}
      }

