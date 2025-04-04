package hashmap;


import java.util.HashMap;

public class hashmapfruit {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "apple");
        map.put(2, "orange");
        map.put(3, "kiwi");

        System.out.println(map);
        System.out.print(map.get(3));
    }
}