package collection_assignmentphones;

import java.util.ArrayList;

public class main_phone
{
    static ArrayList<phones> ph = new ArrayList<phones>();

    public static void main(String[] args)
{
        phones a = new phones("apple", "q1", 10000,7);
        phones b = new phones("samsung", "s1", 12000,6);
        phones c = new phones("vivo", "v5", 14000,15 );
        phones d = new phones("apple", "s series", 40000,8);
        phones e = new phones("samsung", "ultra pro", 18000,8);
        phones f = new phones("iphone", "pro 12", 10000,6);
        phones g = new phones("iphone", "pro max", 35000,6);
        phones h = new phones("apple", "apple pro", 25000,5);
        phones i = new phones("oppo", "zm series", 4200,8);
        phones j = new phones("samsung", "z series", 47000,10);

        ph.add(a);
        ph.add(b);
        ph.add(c);
        ph.add(d);
        ph.add(e);
        ph.add(e);
        ph.add(f);
        ph.add(g);
        ph.add(h);
        ph.add(i);
        ph.add(j);

        function_phone.find_mobile_by_name("samsung");
        function_phone.display_mobile_detail(6, 15000, ph);
        function_phone.display_mobile_detail_price(10000, 20000);

    }
}