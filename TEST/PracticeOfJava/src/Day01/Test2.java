package Day01;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
//        List<String> list2 = {"1",}
        list.add("1");
        list.add("2");
        list.add("4");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getClass());
        list.add(2,"3");
        System.out.println(list);
        for(String i :list){
            System.out.println(i);
        }

        //////
        Map<String,String> map = new HashMap<>();
        map.put("li","1");
        map.put("liu","2");
        map.put("wang","3");
        System.out.println(map.get("liu")); // 2
        for(String i:map.keySet()){
            System.out.println(map.get(i));
        }
        for(Map.Entry<String,String>i:map.entrySet()){
            System.out.println(i);
            System.out.println(i.getKey()+i.getValue());

        }
    }

}
