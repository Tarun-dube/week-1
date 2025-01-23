import java.util.Scanner;

public class Reverse{
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		
		String st="";
		for(int i=s.length()-1;i>=0;i--){
		     char ch=s.charAt(i);
			 st+=ch;
		   
		   }
		
		
		System.out.println("The reverse string is  "+st);
		
	 }
	 
}