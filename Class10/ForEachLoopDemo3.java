package Class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr = {10, 13, 20, 25, 45, 50};
        //we can't  update the element in  for each loop bc we don't have access to the index;



        for (int x:arr){
            if(x%0!=0){
                x=0;
            }

        }


    }
}