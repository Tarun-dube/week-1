import java.util.Scanner;

public class Remove{



	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		System.out.println("enter the  character to be removed from string");
		String c=sc.next();
		
		String st=s.replace(c,"");
		
		

        System.out.println(st);
		
		
		
	 }
	 
}