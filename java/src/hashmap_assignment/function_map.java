package hashmap_assignment;
import java.security.KeyStore.Entry;
import java.util.Scanner;


public class function_map extends hashproduct
{

static int total=0;
static float d,f;
public static void display()

{
	System.out.print("Welcome to the store,see the list you would like to buy\n");
	for(Entry<Integer,product> e :h.entrySet())
	{
		
		product s =e.getValue();
		System.out.print("id:" + e.getKey()+"      name:" + s.name  + "    price:"+s.price  +  "Quantity:"+s.quantity  );
		
	}
}

public static void buyitem()
{
	int x;
	int cor;
	System.out.println("Enter the product id you want to purchase:\n enter 11 to exit");
	Scanner sc = new Scanner (System.in);
	int n=sc.nextInt();
	if(n==11)
	{
		System.out.println("You like to exit");
		
		for(Entry<Integer,product> z :p.entrySet())
		{
			product s1 =z.getValue();
			System.out.println("id:" + z.getKey()+"      name:" + s1.name  + "    price:"+s1.price + "Quantity:"+s1.quantity );
				
		}
		System.out.println("Total: "+total);
	}
	else if (n>11 || n==0)
	{
		System.out.println("No such id exist");
		for(Entry<Integer,product> z:p.entrySet())
		{
			product s1 =z.getValue();
			System.out.println("id:" + z.getKey()+"      name:" + s1.name  + "    price:"+s1.price + "Quantity:"+s1.quantity );
				
		}
	}
	
}




}
