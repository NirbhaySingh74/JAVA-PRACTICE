package ArrayList;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        // creat arrayList of Integer size
        ArrayList<Integer> list = new ArrayList<>();
        // Add Elements in the arrayList
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0, 1);
        System.out.println(list);
        // Remove Elements in the arrayList
        list.remove(1);
        System.out.println(list);
        // iterate on arrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // using another for loop
        for (int num : list) {
            System.out.println(num);
        }
    }
}
