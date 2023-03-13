package class32;


import utils.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args) throws IOException {
       /* try {
            ExcelReader.Read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        test();
    }
     static void test() throws IOException {
        try {
           // ExcelReader.Read();

        }catch (Exception e){
            System.out.println(e);
        }
    }


    }