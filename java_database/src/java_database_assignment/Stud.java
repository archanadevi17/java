package java_database_assignment;

public class Stud {
	int sid;
	String sname;
	int phy;
	int Chem;
	int avg;
	
public Stud(int sid,String sname,int phy,int Chem) {
	this.sid= sid;
	this.sname=sname;
	this.phy=phy;
	this.Chem=Chem;
	
	
}


public void CalAvg() {
	this.avg=(phy+Chem)/2;
}
//public int getsid() {
//	return sid;
//}
//public String getsname() {
//	return sname;
//}
//public int getphy() {
//	return phy;
//}
//public int getChem() {
//	return Chem;
//}
//public float getavg1() {
//	return avg;
//}
}




 