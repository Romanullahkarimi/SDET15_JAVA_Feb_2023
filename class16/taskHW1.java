package class16;

public class taskHW1 {
    /*  1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
      Method should be visibly only within same package and accessible by the creating an instance of the class.
      return type= int
      name=> sumArrayElements
      parameter=> int[] arr
      access modifier= defult

  */
    int sumArrayElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {12, 3342, 24, 23, 42, 42, 2};
        taskHW1 task7 = new taskHW1();

        System.out.println(task7.sumArrayElements(arr));

    }

}




