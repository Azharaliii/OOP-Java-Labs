class Duplicate{ 
	public static void main(String args[]){
		String A="Azhar";
		  String u=A.toUpperCase();
		int l=u.length();
	for(int i=0; i<l; i++){
	char c=u.charAt(i);
	for(int j=i+1; j<l; j++){
		if(u.charAt(i)==u.charAt(j))
				System.out.println(u.charAt(i));	

}
		
	}
	
	System.out.println(l);

		}
			

	}