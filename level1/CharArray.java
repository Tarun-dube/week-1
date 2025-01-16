import java.util.*;
 
class CharArray{

      public char[] chararray(String s){
	     char[] a=new char[s.length()];
		 for(int i=0;i<s.length();i++){
		    a[i]=s.charAt(i);
		 }
		 
		 return a;
	  }
	  
	  
     public boolean compare(char[] a, char[] b){
     if (a.length!=b.length)return false;
	
	 for(int i=0;i<a.length;i++){
	   if(a[i]!=b[i]) return false;
	   
	}
	 return true;
    }
 
 
 
     public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  
	  //take input
	  System.out.println("enter the first string");
	  String s1=sc.nextLine();
	  
	 
	  
	  
	  //call function
	   CharArray obj=new CharArray();
	   
	   char[] a=obj.chararray(s1);
	     char[] b=s1.toCharArray();
		 
		
 
            //compare
	     
	  if(obj.compare(a,b)) System.out.println("both arrays are equal "+Arrays.toString(a));
	  else System.out.println("both arrays are not equal ");
	  
	 
	
	  
	 
	 }
}