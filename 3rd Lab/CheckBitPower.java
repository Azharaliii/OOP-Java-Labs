class CheckBitPower{
	public static void main(String args[]){
	int a=32;   
	boolean X = (a > 0 && (a&(a-1))==0);
	System.out.print(X);
	
	}
}