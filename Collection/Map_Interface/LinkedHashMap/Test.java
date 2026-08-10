import java.util.*;


public class Test {
    public static void main(String[] args) {
    /*
    Stores unique key-value pairs.
    Maintains insertion order.
    Allows one null key and multiple null values.
    It is not thread-safe; to synchronize it, use Collections.synchronizedMap().
    
    Internal Working of LinkedHashMap
    LinkedHashMap extends HashMap and implements the Map interface:

    public class LinkedHashMap extends HashMap implements Map
    */


        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("A",1 );
        map.put("B", 2);
        map.put("C", 8);
        map.put("D", 4);
        map.put("E", 2);

        //System.out.println(map);

        map.put("C", 3);
        //System.out.println(map);

        Map<String,Integer> m = new LinkedHashMap<>();
        m.put("F", 9);

        map.putAll(m);
        System.out.println(map);

        
        System.out.println(map.putIfAbsent("E", 8));
        System.out.println(map.putIfAbsent("G", 8));
        System.out.println(map.get("C"));
        System.out.println(map.getOrDefault("H",0 ));

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue(4));

        System.out.println(map.replace("F", 7));
        System.out.println(map.remove("C"));
        System.out.println(map);
        

        // Returns all the key present in the Map
        Set<String> s = map.keySet();
        System.out.println(s);

        // Returns all the key present in the Map
        Collection<Integer> c = map.values();
        System.out.println(c);

        // Returns a set of all key/value mapping present in a map
        Set<Map.Entry<String, Integer>> e=map.entrySet();
        System.out.println(e);

        // Iterate through the LinkedHashMap
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Keys : " + entry.getKey()+ " values : "+ entry.getValue());
        }






        







        
    }
    
}
