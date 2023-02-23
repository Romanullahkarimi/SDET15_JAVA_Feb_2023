package class16;

public class task2 {


  /*  4)Create a method that will say Hello
    in different language based on the country
    that will passed when method is executed*/
        //return type=>string void
        //name = sayHello
        //parameter =>string countryName

    String sayhello(String  countryName){
        switch (countryName){
            case "Afghanistan":
                return "Asalaam alikum";
            case "USA":
                return "hello";
            case "china ":
                return "Ni hao";
            case "italy":
                return "Ciao";
            default:
                return "counry not supported";
        }
    }

    public static void main(String[] args) {
        task2 LG=new task2();
        System.out.println(LG.sayhello("Afghanistan"));
    }
}
