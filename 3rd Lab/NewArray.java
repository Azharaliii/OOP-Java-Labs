class NewArray{
	public static void main(String args[]){
		int Matrix[][]={{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
		int Matrix2[][]={{0,9,8,4},{2,6,5,8},{9,0,1,2},{8,5,2,1}};
		
		//Matrix 1
		System.out.println("Matrix (1)");		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
			System.out.print(Matrix[i][j] + " ");		
			}
			System.out.println();		
		}
		//Matrix 2
				System.out.println("Matrix (2)");		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
			System.out.print(Matrix2[i][j] + " ");		
			}
			System.out.println();		
		}
			System.out.println();
				System.out.println();
			//Addition 
				System.out.println("Addition");		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
			System.out.print(Matrix[i][j]+Matrix2[i][j] + " " );		
			}
			System.out.println();		
		}
			//subtract
				System.out.println("subtract");		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
			System.out.print(Matrix[i][j]-Matrix2[i][j] + " " );		
			}
			System.out.println();		
		}
			//Multiplication
				System.out.println("Multiplication");		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
			System.out.print(Matrix[i][j]*Matrix2[i][j] + " " );		
			}
			System.out.println();		
		}
		

	}
}