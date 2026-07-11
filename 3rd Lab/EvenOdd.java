import java.util.Scanner;
class EvenOdd{
	public static void main(String arg[]){
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	if((a & 1 )==0){
	System.out.print(" is Even.");
}else {
   System.out.print(" is Odd.");
	}

	}

}