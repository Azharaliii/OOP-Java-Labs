import java.util.Scanner;
class Tax{
	public static void main(String args[]){

	System.out.print("Enter Your income.");
	Scanner input=new Scanner(System.in);
	
	int income=input.nextInt();
	double owned=0;
if(income <=10000){
		owned=0.10*10000;
}else if(income>10000 && income<=20000) {
		owned=((10000*0.10) + (income-10000)*0.15 );
}else if (income>20000){
		owned=((10000*0.10) + (10000*0.15) + (income-20000)*0.20);

}
System.out.print("Your income tax owned " + owned);

	
	}
}