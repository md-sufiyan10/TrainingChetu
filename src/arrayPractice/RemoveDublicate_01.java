package arrayPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDublicate_01 {
    static void main() {
        int arr[]={2,3,4,5,2,4,6,7,4,4};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer no:arr){
        Integer count=  map.get(no);
        if(count==null)
            map.put(no,1);
        else
            map.put(no,count+1);
        }
        System.out.println("Duplicate Element is:");
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        for(Map.Entry<Integer,Integer> entry:set){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" ");
            }
        }

    }
}
