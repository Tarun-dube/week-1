import java.util.*;

public class Length{

    public int len(String s){
	   char c;
	   int count=0;
	   
	   
	   for(int i=0; ;i++){
	   
	    try{
		c=s.charAt(i);
		 count++;
		 }
		 catch(Exception e){
		 break;
		 }
		 
	   }
	   return count;
	}

      public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("enter the string");
	  String s=sc.nextLine();
	  
	  
	  //create obj
	  Length obj=new Length();
	  
	  //call function
	  int a=obj.len(s);
	  int b=s.length();
	  
	  
	  if(a==b) System.out.println(a);
	  
	  
	  }

}