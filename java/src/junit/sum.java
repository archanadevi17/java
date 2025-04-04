package junit;

public class sum {
	int sum=0;
	public int getsum(int[] s)
	{
		for(int i:s)
		{
			sum=sum+i;
		}
		return sum;
	}

}
