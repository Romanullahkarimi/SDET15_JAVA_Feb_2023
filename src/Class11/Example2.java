package Class11;

public class Example2 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 60},
                {30, 40, 59, 60, 78},

        };
        for(int[] arr:matrix ){
            for(int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }



        }
    }
