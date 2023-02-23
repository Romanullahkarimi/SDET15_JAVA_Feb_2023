package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String>subject=new LinkedList<>();
        subject.add("SDLC");
        subject.add("Maunal testing");
        subject.add("Jira");
        subject.add("Git");
        subject.add("Java");
        LinkedList<String>futureSubject=new LinkedList<>();
        futureSubject.add("Selenium");
        futureSubject.add("Testing");
        futureSubject.add("Cucumber");
        futureSubject.add("SQL");
        futureSubject.add("APIs");
        futureSubject.add("Jenkins");
        LinkedList<String>allSubject=new LinkedList<>();
       allSubject.addAll(subject);
       allSubject.addAll(futureSubject);
       allSubject.addAll(allSubject);//addAll methods can print all subjects
        System.out.println(allSubject);
        LinkedList<String>subjectsLike=new LinkedList<>();
        subjectsLike.add("java");
        subjectsLike.add("SDLC");
        System.out.println(subjectsLike);
        allSubject.removeAll(subjectsLike);
        System.out.println(allSubject);
    }
}
