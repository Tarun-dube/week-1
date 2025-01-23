import java.util.Scanner;

public class Palindrome{


    public boolean palindrome(String s){
	int n=s.length();
	         for(int i=0;i<n;i++){
		        if(s.charAt(i)!=s.charAt(n-1-i)) return false;
		   
		   }
		   return true;
		   
	}
	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		
		
		Palindrome obj=new Palindrome();
		
		if(obj.palindrome(s)) System.out.println("It is palindrome");
		else  System.out.println("It is not a palindrome");
		
		
	 }
	 
}