import java.util.Scanner;

public class Replace{

     public String replace(String s,char c1,char c2){
	     String st="";
		 for(int i=0;i<s.length();i++){
		   char ch=s.charAt(i);
		   if(ch==c1) st+=c2;
		   else st+=ch;
		 }
		 return st;
	 }

	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		System.out.println("enter the  character to be replace from string");
		char c=sc.next().charAt(0);
		System.out.println("enter the  character by which it is replaced");
		char a=sc.next().charAt(0);
		
		Replace obj=new Replace();
		
		String st=obj.replace(s,c,a);
		
		

        System.out.println(st);
		
		
		
	 }
	 
}