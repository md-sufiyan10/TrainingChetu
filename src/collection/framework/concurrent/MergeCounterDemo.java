package collection.framework.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MergeCounterDemo {
    static void main() throws InterruptedException {

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("count", 0);


        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.merge("count", 1, (oldValue, newValue) -> oldValue + newValue);
            }
            //map.merge(key, x, remapFunction)
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 2000");
        System.out.println("Actual  : " + map.get("count"));
    }
}
