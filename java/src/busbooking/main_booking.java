package busbooking;

import java.sql.SQLException;

public  class main_booking {
	
	
	static data_func o=new data_func();
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		o.getdata();
		System.out.println("getdata run");
		bookseat(10,2);
		System.out.println("getdata run");
		o.putdata();
		
	
	}
//	static void display() {
//		// TODO Auto-generated method stub
//		
//	}
	{
	for(java.util.Map.Entry<Integer, busroute> e :o.map.entrySet())
	{
		busroute st=e.getValue();
		System.out.println(st.rid+" "+ st.p+ " "+st.d+" "+st.tot+" "+st.rem+" "+st.cost+"\n");
	}
}
	static void bookseat(int rid,int num) {
		int tot=cal_booking(rid,num);
		ticketbook obj=new ticketbook(1,rid,num,tot);
		o.map1.put(obj.rid, obj);
		
		for(java.util.Map.Entry<Integer, ticketbook> e :o.map1.entrySet())
		{
			ticketbook st=e.getValue();
			System.out.println(st.bid+" "+ st.rid +" "+" "+st.num+" "+st.tot+" "+" ");
		}
		System.out.println("1 seat updated \n ");
		

		for(java.util.Map.Entry<Integer, busroute> e :o.map.entrySet())
		{
			busroute st=e.getValue();
			System.out.println(st.rid+" "+ st.p+ " "+st.d+" "+st.tot+" "+st.rem+" "+st.cost+"\n");
		}

}
	
	
	 static int cal_booking(int rid, int num) {
		// TODO Auto-generated method stub
		int a=0;
		for(java.util.Map.Entry<Integer, busroute> e :o.map.entrySet())
		{
			busroute st=e.getValue();
			if(st.rid==rid)
			{
				st.rem=num;
				a=st.cost;
			}
		
		}
		System.out.println(a);
		
		return a*num;
	}
	}
	