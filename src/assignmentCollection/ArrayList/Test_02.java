package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test_02 {
    static void main() {
        List<String> list=new ArrayList<>(Arrays.asList("A","B","B","C"));
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String data=iterator.next();
            if(data.equals("B")){
                iterator.remove();
            }
        }
        System.out.println("Final list: "+list);
    }

}

