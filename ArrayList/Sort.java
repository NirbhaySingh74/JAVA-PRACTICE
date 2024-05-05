package ArrayList;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(8);
        list.add(3);
        list.add(14);
        System.out.println("Before sorting : " + list);
        Collections.sort(list);
        System.out.println("After Sorting " + list);
    }
}
