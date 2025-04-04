package Comparable;

import java.util.ArrayList;
import java.util.*;


public class main_compare
{
    public static void main(String[] args)
 {
        List<stu1> l = new ArrayList<stu1>();
        l.add(new stu1("Archana", 101));
        l.add(new stu1("Rahul", 102));
        l.add(new stu1("Kaviya", 157));

        for (stu1 s : l)
       {
            System.out.println(s.id + " : " + s.name);
        }

        System.out.println();
        System.out.println();

        Collections.sort(l);

        System.out.println("Using compare to");
        for (stu1 s:l )
          {
              System.out.println(s.id + " : " + s.name);
           }
    }
}