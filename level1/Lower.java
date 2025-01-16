import java.util.*;
 
class Lower{

    public String convertlower(String s){
		
	String a="";
	for(int i=0;i<s.length();i++){
	char ch=s.charAt(i);
	if(ch>='A' && ch<='Z'){ 
	ch+=32;
	
	}
	a+=ch;
	}
	return a;
	
	}
	
 
 
 
     public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  
	  //take input
	  System.out.println("enter the  string");
	  String s1=sc.nextLine();
	  
	   
	  
	
	  
	  //call function
	    Lower obj=new Lower();
	   
	   String a=obj.convertlower(s1);
	   
	   String b=s1.toLowerCase();
	   

	   	  // System.out.println(a);
	   if (a.equals(b))
	   System.out.println("both are equal and the new string is "+a);
	    else System.out.println("both are not equal");
	   
	
	  
	 
	 }
}