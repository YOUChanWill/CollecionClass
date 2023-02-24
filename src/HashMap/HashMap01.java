package HashMap;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("YOU",10000);
        map.put("CHAN",20000);
        map.put("WILL",15000);
        System.out.println(map);

        map.put("YOU",30000);// 替换，更新
        System.out.println(map);

        Set keySet = map.keySet();
        for (Object key : keySet){
            map.put( key , (Integer) map.get(key) + 100);// 将值+100
        }
        System.out.println(map);

        // HashMap的遍历
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Collection values = map.values();
        for (Object vlaue : values){
            System.out.println(vlaue);
        }
    }
}
