import java.util.Scanner;
class Q2{
public static void main(String args[]){
Scanner s = new Scanner(System.in);

int dept = 2;            // Total Departments
int arr[][][]= new int[2][][];

        for(int i=0; i<dept; i++){
	System.out.print("How many Employees in Department "+(i+1)+": " );
        int emp = s.nextInt();            //Employees 
        arr[i]= new int[emp][5]; // ensure each employee has 5 working days

      for(int j=0; j<emp; j++){
      System.out.print("How many Working Hours of Employee " + (j+1) + " in Department "+(i+1)+": " );
 
      for(int k=0; k<5; k++){
	arr[i][j][k]= s.nextInt();}
      } 

        
}
}

for(int i=0; i<dept; i++){
System.out.print("Department...."+ (i+1)+ ":");
	for(int j=0; j<arr[i].length; j++){
	System.out.print("Employee.... "+ (j+1)+ ":");
		for(int k=0 ; k<5; k++){
		System.out.print(arr[i][j][k]+":");
		 
	}
	System.out.println();
}
System.out.println();




}


}
