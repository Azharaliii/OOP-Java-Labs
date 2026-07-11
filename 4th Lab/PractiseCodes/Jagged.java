class Jagged {
public static void main(String args[]){
int stu[][] = new int[3][];
 stu[0]  = new int[2] ; 
 stu[1]  = new int[1] ;
  stu[2]  = new int[3] ;

	for(int i=0; i<stu.length; i++){
     for (int j=0; j<stu[i].length; j++){
	System.out.print("Azhar Ali: "+ stu[i][j]);
	}
	System.out.println();

}

}



}