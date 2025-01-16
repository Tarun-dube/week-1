import java.util.*;
 
class Words{

    public int len(String s){
	     int count=0;
		 for(char c: s.toCharArray()){
		     count++;
		 }
		 
		 return count;
	}
	
	public String[][] words(String[] a){
	Words obj=new Words();
	  int n=a.length;
	  String[][] s=new String[n][2];
	  for(int i=0;i<n;i++){
	    s[i][0]=a[i];
		s[i][1]=Integer.toString(obj.len(a[i]));
	  }
	  return s;
	  
	
	}
 
 
 
     public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  
	  //take input
	  
	  //string s=sc.nextLine();
	  System.out.println("enter the no of words");
	  int n=sc.nextInt();
	  
	  System.out.println("enter the words");
	  String[] s=new String[n];
	  
	  for(int i=0;i<n;i++){
	   s[i]=sc.next();
	  
	   }
	  
	   Words obj=new Words();
	  
	  String[][] s1=obj.words(s);
	  
	  for(int i=0;i<n;i++){
	   int a=Integer.parseInt(s1[i][1]);
	  System.out.println(s1[i][0]+" "+a);
	  }
	 
	
	 }
}