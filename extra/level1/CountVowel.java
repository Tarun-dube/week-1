import java.util.Scanner;

public class CountVowel{
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.nextLine();
		int vowel=0;
		int consonent=0;
		for(int i=0;i<s.length();i++){
		   if((s.charAt(i)>=65 && s.charAt(i)<=90)
		   ||(s.charAt(i)>=97 && s.charAt(i)<=122)){
		   if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||
		   s.charAt(i)=='o'|| s.charAt(i)=='u'|| s.charAt(i)=='A'||
		   s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='o'||
		   s.charAt(i)=='u') vowel++;
		   
		   else consonent++;
		  
		   
		   }
		}
		
		System.out.println("The no of vowel is "+vowel);
		System.out.println("The no of consonent is "+consonent);
	 }
	 
}