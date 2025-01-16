import java.util.*;
 
class ConvertUpper{

    public String convertupper(String s){
		
	String a="";
	for(int i=0;i<s.length();i++){
	char ch=s.charAt(i);
	if(ch>='a' && ch<='z'){ 
	ch-=32;
	
	}
	a+=ch;
	}
	return a;
	
	}
	
	
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
	  System.out.println("enter the  string");
	  String s1=sc.nextLine();
	  
	   
	  
	
	  
	  //call function
	    ConvertUpper obj=new ConvertUpper();
	   
	   String a=obj.convertupper(s1);
	   
	   String b=s1.toUpperCase();
	   

	   	  // System.out.println(a);
	   if (a.equals(b))
	   System.out.println("both are equal and the new string is "+a);
	    else System.out.println("both are not equal");
	   
	
	  
	 
	 }
}