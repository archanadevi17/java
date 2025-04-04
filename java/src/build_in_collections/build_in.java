package build_in_collections;

import java.util.Arrays;
import java.util.*;


public class build_in
{
    public static void main(String[] args)
     {
        int[] num = {5, 7, 2, 6, 89};
       
        List<Integer> nlist = Arrays.asList(5, 7, 2, 6, 89);
        System.out.println("nlist: " + nlist);

        Collections.sort(nlist);
        System.out.println("Sorted nlist: " + nlist);

        Collections.reverse(nlist);
        System.out.println("Reversed nlist: " + nlist);
    }
}