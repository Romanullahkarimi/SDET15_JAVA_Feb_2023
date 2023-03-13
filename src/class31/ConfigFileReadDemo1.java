package class31;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        //this is the path of  file from which we  want to read the data
        String path="Files/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        //this properties class wiil assist us to read and write data to properties files
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser "));
        fileInputStream.close();



    }
}
