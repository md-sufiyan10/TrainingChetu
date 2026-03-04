package collection.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {

    public static void printCollection(Collection <String> c){

        for(String s:c){
            System.out.println(s);
        }
    }

    static void main() {
        Collection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        printCollection(list);

        System.out.println("------------------");

        Collection<String> set = new HashSet<>();
        set.add("X");
        set.add("Y");
        set.add("Z");
        printCollection(set);
    }

}
