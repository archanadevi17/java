package collection;

import java.util.ArrayList;

public class fruits
{
    public static void main(String[] args)
  {
        ArrayList<String> slist = new ArrayList<String>();

       
        slist.add("apple");
        slist.add("orange");
        slist.add("giwi");

     
        String f = slist.get(0);
        System.out.print("\n" + f);

         for (String s : slist)
         {
            System.out.print("\n" + s);
          }
     }
}