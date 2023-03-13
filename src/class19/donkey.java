package class19;

public class donkey {
    String name;
    int age;
    double weight;
  /*  donkey(){
        System.out.println("this is none arguement constructor");
    }*/
    donkey(String name, int Age){
      this.  name=name;//right is local and left is instance
        this.age=Age;
    }


    void print(){
        System.out.println("donkey name is "+name+" age is "+age+" and weight is "+weight);
    }
}
