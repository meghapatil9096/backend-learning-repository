package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rahul");
        map.put(2, "Joy");
        map.put(null, null);
        map.put(null, "Jone");
        System.out.println(map);
        System.out.println("get index 2 : " + map.get(2));
        System.out.println("key - 3 is present? : " + map.containsKey(3));
        map.put(3, "Pooja");
        map.remove(3);
        System.out.println("map : " + map);

//        Count frequency of each element using HashMap
        int[] arr = {1, 2, 3, 1, 2, 1, 4};

        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i : arr) {
            if (m1.containsKey(i)) {
                m1.put(i, m1.get(i) + 1);
            } else {
                m1.put(i, 1);
            }
        }
        System.out.println("Frequency of each element : " + m1);


    }
}
