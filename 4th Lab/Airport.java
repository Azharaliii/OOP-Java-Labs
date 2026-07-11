import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	
	System.out.print("Enter Number of flights:");
	int flitSize= s.nextInt();
	
	String arr[][]=new String[flitSize][];
	int seats = 0;
for(int i=0; i<flitSize; i++){
	System.out.print("Enter Number of seats in flight "+(i+1) +" : ");  
	seats= s.nextInt();
	arr[i]=new String[seats];
		}

for(int i=0; i<flitSize; i++){
	System.out.print("Flight: "+(i+1));	
   for(int j=0; j<arr[i].length; j++){
	arr[i][j]="[Available]";
	
	System.out.print(arr[i][j]+" ");
}
	System.out.println();
	System.out.println();
}
	System.out.println("Book a seat :");
	System.out.print("Enter Flight Number (1-" + (arr.length) + "): " );
	int bookedfl = s.nextInt()-1 ;
	System.out.print("Enter Seat Number  (1-" + (arr[bookedfl].length) + "): " );
	int bookeds = s.nextInt() -1 ;
	arr[bookedfl][bookeds] = "[Booked]";

for(int i=0; i<flitSize; i++){
	System.out.print("Flight: "+(i+1));	
   for(int j=0; j<arr[i].length; j++){
	System.out.print(arr[i][j]+" ");
}
	System.out.println();

}	


            }
}
