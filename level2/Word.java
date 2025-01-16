import java.util.*;

public class Word{

    public String[] word(String s){
	String st="";
	
	int n=1;
	Word ob=new Word();
	for(int i=0;i<ob.len(s);i++){
	   if(s.charAt(i)==' '){
	   n++;
	   }
	   
	}
	String[] a=new String[n];
	
	
	
	int index=0;
	
	Word obj=new Word();
	
	int k=obj.len(s);
	for(int i=0;i<obj.len(s);i++){
	   if(s.charAt(i)==' '){
	   a[index]=st;
	   index++;
	   st="";
	   }
	   else{
	   st+=s.charAt(i);
	   }
	}
	a[index]=st;
	
	return a;
	}

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
	  Word obj=new Word();
	  
	  //call function
	  String[] a=obj.word(s);
	  
	  
	  
	 for(int i=0;i<a.length;i++){
	 System.out.println(a[i]);
	 }
	  
	  
	  }

}