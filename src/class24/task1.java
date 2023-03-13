package class24;

public class task1 {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
    class computer{
       void playVideo(){
           System.out.println("video is playing");
       }
    }
    class Apple extends computer {
     void browserInternet(){
         System.out.println("fdslghla");
     }
    }
    class Lenovo extends computer {

        @Override
        void playVideo() {

        }
    }

    }

