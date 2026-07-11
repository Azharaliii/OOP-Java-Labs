import java.util.Scanner;
class Arth{
	public static void main(String[] args ){
	 Scanner scanner=new Scanner(System.in) ;  //create scanner class name
	  System.out.println("Enter 2 Digits for   (-,+,/,*) ");
	    System.out.println("Enter 1st number. ");
		Double num1= scanner.nextDouble();
		 System.out.println("Enter 2nd Number. ");
		  Double num2= scanner.nextDouble();    
		
		double add=num1+num2;    
		System.out.println("Addition " +  add);
		 
                double sub=num1-num2;    
		System.out.println("Subtract " +  sub);
                
                double multi=num1*num2;    
		System.out.println("Multiply " +  multi); 
		
		double div=num1/num2;    
		System.out.println("Divide " +  div);
}

}