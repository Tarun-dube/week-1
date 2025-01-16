import java.util.*;
 
class SubString{

     public String substring(String s,int x,int y){
	     String a="";
		 for(int i=x;i<y;i++){
		 char c=s.charAt(i);
		 a+=c;
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
	  System.out.println("enter the string");
	  String s1=sc.nextLine();
	        System.out.println("enter the start index");
	      int start=sc.nextInt();
		  	        System.out.println("enter the end index");

		  int end=sc.nextInt();
	  
	  
	  //call function
	   SubString obj=new SubString();
	   
	   String a=obj.substring(s1,start,end);
	     String b=s1.substring(start,end);
	   
           System.out.println("the substring is "+a);
 
            //compare
	     
	  if(obj.compare(a,b)) System.out.println("both substrings are equal ie "+a);
	
	  
	 
	 }
}