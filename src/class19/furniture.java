package class19;

public class furniture {
    String type;
    double price;
    String color;
    //wiht the help of construtor we can init obj with specific value

    //below is a methods with name furniture why bv of return type
     furniture(String type, double price, String color){
        this.type=type;
        this.price=price;
        this.color=color;

    }
    void print(){
        System.out.println(type+" price "+price+" and color is "+color);
    }
}
