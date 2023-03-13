package class20;

import org.w3c.dom.ls.LSOutput;

public class superClass {
    superClass(){
        System.out.println("i am constructor from parent class constroctor");
    }}
    class subclass extends superClass{
    subclass(){
        super();
        System.out.println("i am child constructor");
    }





}
