package class20;

public class userClass {

    /*
Write program: userClass  that has a constructor that initializes instance
variable name and mobile number. Create a subclass  userInfo that will have
user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method.
Test your code.
     */

        String name;
        int mobileNum;

        userClass(String name, int mobileNum){
            this.name = name;
            this.mobileNum = mobileNum;
        }
    }
    class userInfo extends userClass {
        String address;

     public     userInfo(String name, int mobileNum, String address){
            super(name, mobileNum);
            this.address = address;
        }
       public void userDetails(){
            System.out.println("Name: " + name);
            System.out.println("Mobile Number: " + mobileNum);
            System.out.println("Address: " + address);
        }
        public static void main(String[] args) {
            userInfo user = new userInfo("Amber", 658487, "2365 Main St");
            user.userDetails();
    }
}

