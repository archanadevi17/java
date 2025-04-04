package hashmap_assignment;
import java.util.*;

public class hashproduct {
	static HashMap<Integer,product>h=new HashMap<Integer,product>();
	static HashMap<Integer,product>p=new HashMap<Integer,product>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product samsung=new product(1,"samsung",45000,"galaxy",7);
		product apple=new product(2,"apple",130000,"pro1",9);
		product vivo=new product(3,"vivo",25000,"vs4",6);
		product redmi=new product(4,"redmi",35000,"redmi 13",5);
		product realmi=new product(5," realmi",54000,"zoneout",8);
		product oppo=new product(6,"oppo",53000,"ultrapro",4);
		product oneplus=new product(7,"oneplus",32000,"maxii",6);
		product poco=new product(8,"poco",62000,"poco 14",7);
		product moto=new product(9,"moto",49000,"moto v3",3);
		product google=new product(10,"google",98000,"pixel7",8);
		
		
		h.put(samsung.id,samsung);
		h.put(apple.id,apple);
		h.put(vivo.id,vivo);
		h.put(redmi.id,redmi);
		h.put(realmi.id,realmi);
		h.put(oppo.id,oppo);
		h.put(oneplus.id,oneplus);
		h.put(poco.id,poco);
		h.put(moto.id,moto);
		h.put(google.id,google);

		h.put(samsung.id,samsung);


		
		

	}

}
