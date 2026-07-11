import java.util.Scanner;
class sum{
public static void main(String args[]){
Scanner s= new Scanner(System.in);
int sum=0;
for(int i=0; i<3; i++){
int arr=s.nextInt();
sum=sum+arr;	
}
System.out.print(sum);

	}


}