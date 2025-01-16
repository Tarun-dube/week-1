import java.util.*;
 
class Compare{
    public boolean compare(String s, String a){
     if (s.length()!=a.length())return false;
	
	 for(int i=0;i<s.length();i++){
	   if(s.charAt(i)!=a.charAt(i)) return false;
	   
	}
	 return true;
    }
 
 
 
     public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  
	  //take input
	  System.out.println("enter the first string");
	  String s1=sc.nextLine();
	  
	   System.out.println("enter the second string");
	  String s2=sc.nextLine();
	  
	  //built in function
	  boolean b=s1.equals(s2);
	  
	  //call function
	   Compare obj=new Compare();
	   
	   boolean a=obj.compare(s1,s2);
	   
	   if (a==b){
	   if(a) System.out.println("both are equal");
	    else System.out.println("both are not equal");
	   }
	
	  
	 
	 }
}