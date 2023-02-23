package Class12;

public class stringDemo9 {
    public static void main(String[] args) {
        String strc="asdfjlgwajeo4365#$@@$";

        int counter=0;
        for (int i = 0; i <strc.length() ; i++) {

            if(Character.isDigit(strc.charAt(i))){
                counter++;
            }

        }
        System.out.println("total isAlphabets in strc "+counter);
    }
}
