import java.util.Arrays;
class Q4{
public static void main(String args[]){
	String a="listen";
	String b="silent";

	char[] a1=a.toCharArray();
	char[] b1=b.toCharArray();

	Arrays.sort(a1);
	Arrays.sort(b1);

	if(Arrays.equals(a1,b1)){
	System.out.println("Anagram.");}
else{
System.out.println("Not Anagram.");}}}