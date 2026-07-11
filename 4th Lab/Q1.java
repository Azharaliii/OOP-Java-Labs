import java.util.Random;
public class Q1{

	static String letters="ABCDEFGHIJKLMNOPQRSTVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
	

public static void main(String args[]){
	
	int len=10;
	StringBuilder password = new StringBuilder();
	Random random = new Random();
	System.out.println(letters.length());

	for(int i=0; i<len; i++){
	  int randmIndx = random.nextInt(letters.length());  //generate random index
	  char randmChar = letters.charAt(randmIndx);      // Get character at the random index
		password.append(randmChar);     // append password
	}
	System.out.println("Generated Password: "+ password.toString());
	


}

}