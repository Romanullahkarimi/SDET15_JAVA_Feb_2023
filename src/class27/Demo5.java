package class27;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character>characters=new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('e');
        characters.add('f');
        characters.add('g');
        System.out.println(characters);
        for(Character c:characters){
        System.out.print(c+" ");
    }}
}
