package class20;

public class parent {
    String name;
    static String lastName;
  private   parent(){
        System.out.println(" i am a parent constructor");
    }

    public static void main(String[] args) {
        parent p=new parent();

    }

    public void hello(){
        System.out.println("public method hello from parent class");
    }
    protected  static void bye(){
        System.out.println("protected method by parent class");
    }
    private void money(){
        System.out.println("privae method money from parent ");
    }
}
