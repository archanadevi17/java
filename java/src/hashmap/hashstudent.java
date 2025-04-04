package hashmap;
import java.util.*;
import java.util.Map.Entry;

public class hashstudent {

    public static void main(String[] args) {
        stu Archana = new stu("Archana", 131);
        stu Rahul = new stu("Rahul", 102);
        stu Kaviya = new stu("Kaviya", 157);

        HashMap<Integer, stu> h = new HashMap<Integer, stu>();

        h.put(Archana.id, Archana);
        h.put(Rahul.id, Rahul);
        h.put(Kaviya.id, Kaviya);

        System.out.println("Iteration");

        for (Entry<Integer, stu> e : h.entrySet()) {
            stu s = e.getValue();
            System.out.println("id: " + e.getKey() + " name: " + s.name);
        }
    }
}
