package comparator;

import java.util.Comparator;

public class namecompare implements Comparator<stu2> {
    @Override
    public int compare(stu2 s1, stu2 s2) {
        return s1.name.compareTo(s2.name); // It calls the comparator of the string
    } // Ascending order
}