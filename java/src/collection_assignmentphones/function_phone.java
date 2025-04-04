package collection_assignmentphones;
import java.util.ArrayList;

public class function_phone
{
    public static void find_mobile_by_name(String brand) {
        for (phones a : main_phone.ph)
 {
            if (a.brand==(brand))
          {
                System.out.println("\n brand: " + a.brand + ", model: " + a.model);
            }
        }
    }

       public static void display_mobile_detail_price(int start, int stop)
         {
        System.out.println("\n \n display_mobile_detail_price ");
          for (phones a : main_phone.ph)
            {
            if (a.price > start && a.price < stop)
              {
                System.out.print(" \n  brand: " + a.brand + ", model: " + a.model + ", Price: " + a.price);
               }
            }
          }

             public static void display_mobile_detail(int ram, int price, ArrayList<phones> phoneList) {
        System.out.println("\n \n displaying mobile detail");
        for (phones a : main_phone.ph)
{
            if (a.ram > ram && a.price < price) {
                System.out.print("\n brand: " + a.brand + ", model: " + a.model + ", RAM: " + a.ram + "GB, Price: " + a.price);
            }
        }
    }
}
         
