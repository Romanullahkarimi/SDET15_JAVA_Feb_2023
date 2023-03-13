package class15;

public class MethodPractice {
    //create a metods which return true or false and take the int number as a paramater if number is
    //even it return true otherwise it return false
    Boolean method(int number){
        boolean flag;
        if(number%2==0){
            flag=true;
        }else {
            flag = false;
        }
            return  flag;
        }
        //short way
        boolean isEven(int numbe1){
        if(numbe1%2==0){
            return true;
        }else {
            return false;
        }


            }
            boolean isEven2(int number2){
        return number2%2==0;

        }

}
