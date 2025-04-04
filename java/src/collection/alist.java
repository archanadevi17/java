package collection;

import java.util.ArrayList;

public class alist
 {
    public static void main(String[] args)
     {
        ArrayList<Student1> slist = new ArrayList<Student1>();

        Student1 Archana = new Student1("Archana", 101);
        Student1 Rahul = new Student1("Rahul", 102);
        Student1 Kaviya = new Student1("Kaviya", 107);

        slist.add(Archana);
        slist.add(Rahul);
        slist.add(Kaviya);

       
        Student1 s3 = slist.get(1);
        s3.display();

     
        for (Student1 s5 : slist)
           {
            if (s5.id == 131)
              {
                System.out.print("\n" + s5.name);
              }
           }
      }
}