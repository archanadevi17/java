package generic_list;

import java.util.List;
import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        List<String> a = new Vector<String>();
        a.add("java");
        a.add("python");
        System.out.println(a);
        a.remove("python");
        System.out.println(a);
    }
}
