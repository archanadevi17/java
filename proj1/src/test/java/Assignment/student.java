package Assignment;

public class student {
	
	private int Sid;
	private String Stu_name;
	private String Sem;
	private double Average;
	private double Maths;
	private double Phy;
  public student (int Sid,String Stu_name,String Sem,double Maths,double Phy ) {
	  
	  this.Sid=Sid;
	  this.Stu_name=Stu_name;
	  this.Sem=Sem;
	  this.Maths=Maths;
	  this.Phy=Phy;
	  this.Average=Average; 
  }
  public student(int sid2, double Maths, double Phy, double average2) {
	// TODO Auto-generated constructor stub
}
public int getSid() 
  {
	 return Sid; 
  }
  
  public String getname() 
  {
	 return Stu_name; 
  }

  public String getSem() 
  {
	 return Sem; 
  }
  
  public double getMaths() 
  {
	 return Maths; 
  }
  
  public double getPhy() 
  {
	 return Phy; 
  }
  
  public double getavg() 
  {
	 return Average; 
  }
public void setAverage(double average2) {
	// TODO Auto-generated method stub
	Average=(Maths+Phy)/2; 
}

}
