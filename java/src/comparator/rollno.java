package comparator;

import java.util.Comparator;

public class rollno implements Comparator<stu2> {
    @Override
    public int compare(stu2 s1, stu2 s2) {
        return s2.id - s1.id; // Descending order
    }
}