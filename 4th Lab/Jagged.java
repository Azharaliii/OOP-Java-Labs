import java.util.Scanner;
class jagged {
public static void main(String args[]){

Scanner s = new Scanner(System.in);

int[][] arr= new int[3][];

  for(int i=0; i<arr.length; i++){
	System.out.print(" Enter information " + (i+1));
	int col=3;
	arr[i]=new int[col];  // inialize rows with new numbers
	
 for(int j=0; j<col; j++){
	arr[i][j]= s.nextInt();}
}

for(int i=0; i<arr.length;  i++){
 for(int j=0; j<3; j++){
	System.out.print(arr[i][j]+ " " );
}
System.out.println();
}
}
}