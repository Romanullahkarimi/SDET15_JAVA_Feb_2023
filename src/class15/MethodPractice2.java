package class15;

public class MethodPractice2 {
    //create a metods  that takes a string reverse  it and return the reversed string
    //call the methods reverseStr
String reverseStr(String word) {
    String newStr = "";
    for (int i = word.length()-1; i >= 0; i--) {
        newStr += word.charAt(i);
    }
    return newStr;

}
    String reverseStr1(String input){
   return new  StringBuilder(input).reverse().toString();

    }
    String reverseStrs2(String input1){
    StringBuilder name=new StringBuilder(input1);
    name.reverse();
    return  name.toString();
    }
}
