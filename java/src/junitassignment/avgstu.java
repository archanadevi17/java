package junitassignment;

public class avgstu {
	
	protected int ai, ds, ml,ex_op;
	public avgstu (int ai,int ds,int ml,int ex_op) {
		this.ai= ai;
		this.ds=ds;
		this.ml=ml;
		this.ex_op=ex_op;
		
		
	}
	
	public int  calcavg(int ai, int ds, int ml) {
		
			int avg=(ai+ds+ml)/3;
			return avg;
		}
}
