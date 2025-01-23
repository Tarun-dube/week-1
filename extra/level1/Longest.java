import java.util.Scanner;

public class Longest{


    public String longest(String s){
	
	         String word="";
			 String longestWord="";
	         for(int i=0;i<s.length();i++){
		        if(s.charAt(i)==' '){
					if(word.length()>longestWord.length()) {
					longestWord=word;
					
					
					}
					word="";
				}
				else word+=s.charAt(i);
		   
		   }
		   if(word.length()>longestWord.length()) longestWord=word;
		   
		   return longestWord;
		   
	}
	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		
		
		Longest obj=new Longest();
		
		 System.out.println("the longest word is "+obj.longest(s));
		
		
		
	 }
	 
}