package Class12;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       /* Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.
        Only after all requirements met → message “Your username and password has been created”*/
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter userName");
        String userName=scan.next();
        System.out.println("please enter password");
        String password=scan.next();
        System.out.println("please enter password again");
        String password1=scan.next();
        if (userName.isEmpty() ||password.isEmpty()){
            System.out.println("username or password connot ba empty");
        }else if (password.length()<8){
            System.out.println("password is too short");
        } else if (password.contains(userName)) {
            System.out.println("password connot contain username");

        } else if (!password.equals(password1)) {
            System.out.println("password fot not match");

        }else {
            System.out.println("your username and password has been created");
        }


    }
}
