package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_01 {
       public static void main(String[] args) {
            List<String> list=new ArrayList<>(Arrays.asList("A","B","B","D"));
            for(int i=0;i<list.size();i++){
                if(list.get(i)=="B"){
                    list.remove(i);
                }
            }
            System.out.println("Final List: "+list);
        }


}
