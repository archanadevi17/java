package junitexample;

public class sumeven {
	public int add(int n2)
	{
		int n=94832,sum=0,rem=0,num=n,v=0;
		while(n>0)
		{
			rem=n%10;
			v=rem;
			if(rem%2==0)
			{
				sum=sum+v;
			}
			n=n/10;
		}
		System.out.println("sum of digits"+num+"="+sum);
		return sum;
	}
	
}
