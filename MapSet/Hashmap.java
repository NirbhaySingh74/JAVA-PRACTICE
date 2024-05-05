package MapSet;

import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        // how to create hashmap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(121, "Nirbhay");
        map.put(120, "Nirbhay");
        map.put(200, "kunal");
        map.put(240, "deepak");
        for (Integer key : map.keySet()) {
            System.out.println("Key : " + key + ", value : " + map.get(key));
        }
    }
}