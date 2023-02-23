package class20;

public class sport {
    String name;
    String country;
    sport(String name, String country){
        this.name=name;
        this.country=country;

    }

    public void display(){
        System.out.println(name+"is played in "+country);

    }
}
class cricket extends sport{
    String helmet;
    cricket(String name, String country, String helmet){
        super(name, country);//refer to sport
        this.helmet=helmet;//define current
    }
}
class soccor extends sport{
    String team;
    int numberOfPlayer;
    soccor(String name, String country, String team, int numerOfPlayer){
        super(name,country);
        this.team=team;
        this.numberOfPlayer=numerOfPlayer;

    }
}
 class  SportTest{
    public static void main(String[] args) {

    }

}
