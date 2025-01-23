import java.util.Scanner;

public class UpperLower{



	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		
		String st="";
		char ch;
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			ch=s.charAt(i);
			ch-=32;
			st+=ch;
		}
		else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			 ch=s.charAt(i);
			 ch+=32;
			st+=ch;
		
		}
		else {
			 ch=s.charAt(i);
			st+=ch;
		}
		}
		
		 System.out.println("the longest word is "+st);
		
		
		
	 }
	 
}