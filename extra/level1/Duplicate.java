import java.util.Scanner;

public class Duplicate{


    public String removeDuplicate(String s){
	
	         String ans="";
	         for(int i=0;i<s.length();i++){
		        int j=0;
				for(j=0;j<i;j++){
				     if(s.charAt(i)==s.charAt(j) ) break;
				}
		   if(i==j) ans+=s.charAt(i);
		   }
		   return ans;
		   
	}
	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		
		
		Duplicate obj=new Duplicate();
		
		 System.out.println("the new string is "+obj.removeDuplicate(s));
		
		
		
	 }
	 
}