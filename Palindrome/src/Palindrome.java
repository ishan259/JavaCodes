
	import java.util.Scanner;
	class Palindrome{
	public static void main(String args[]){
	System.out.println("Enter your name");
	String s1;
	String s2;
	boolean scomp;
	Scanner sc=new Scanner(System.in);
	s1=sc.nextLine();
		s2 = s1;
	String strCopy = new String(s1);
	String sb = new StringBuilder(s2).reverse().toString();
	System.out.println(sb);
		scomp = s1.equals(sb);
		
			if(scomp==true){
		 	         System.out.println("Palindrome");
	      	      } else {
	         System.out.println("Not Palindrome");
	      }
}
}