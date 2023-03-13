package class17;

public class dog {
    String name;
    String breed;
    int age;
    double weight;
dog(String dogName, String dogBreed,  int dogAge, double dogWeight){
    name=dogName;
    breed=dogBreed;
    age=dogAge;
    weight=dogWeight;

}
void printInfo(){
    System.out.println("name"+name+"breed"+breed+"age"+age+"weight"+weight);
}


}
