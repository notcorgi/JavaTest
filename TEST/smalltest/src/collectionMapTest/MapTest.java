package collectionMapTest;

import java.util.HashMap;
import java.util.Map;

//遍历map
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(new String("li"), 20);
        map.put(new String("liu"), 21);
        map.put("wang", 22);
        System.out.println(map.toString());
        for (String str : map.keySet()) {
            System.out.println(map.get(str));
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
    }
}
