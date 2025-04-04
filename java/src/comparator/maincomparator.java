
package comparator;


import java.util.ArrayList;
import java.util.*;


public class maincomparator {
    public static void main(String[] args) {
        List<stu2> l = new ArrayList<>();

        l.add(new stu2("Rahul", 1021));
        l.add(new stu2("Archa", 2022));
        l.add(new stu2("Kaviya", 157));

        for(stu2 s : l)
        {
            System.out.println(s.id + " " + s.name);
        }

        Collections.sort(l, new rollno());
        System.out.println("\n\n id:des");
     

        for(stu2 s : l)
        {
            System.out.println(s.id + " " + s.name);
        }
            System.out.println("\n \n name:ass");
            Collections.sort(l, new namecompare());      
              for(stu2 s : l)
        {  
           
           System.out.println(s.id + " " + s.name);

        }
    }
}