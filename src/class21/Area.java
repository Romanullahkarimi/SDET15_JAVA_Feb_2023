package class21;

public class Area {
  /*  Create 1 class in which create a methods that will calculate the area of
            Rectangle
            Square*/
    void caculateArea(double length, double wight){
        System.out.println("Area of regtangle is"+(length*wight));

    }
    void caculateArea(double side){
        System.out.println("Area of regtangle is"+(side*side));
}

    public static void main(String[] args) {
        Area area=new Area();
        area.caculateArea(10);
        area.caculateArea(10,20);
    }
}
