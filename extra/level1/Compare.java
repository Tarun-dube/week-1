import java.util.Scanner;

public class Compare{



	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the  first string");
		String s=sc.nextLine();
		
		System.out.println("enter the  first string");
		String st=sc.nextLine();
		
		
		
		int n=s.length();
		int m=st.length();
		
	     int min;
		 if(n<=m) min=n;
		 else min=m;
		 
		 int a=0;
		 
		 for(int i=0;i<min;i++){
		    if(s.charAt(i)<st.charAt(i)){
			System.out.println(s+"  comes before  "+st);
			a++;
			break;
			}
			else if(s.charAt(i)>st.charAt(i)){
			System.out.println(st+"  comes before "+s);
			a++;
			break;
			
			}
		 }
		 
		
		
		
		if(a==0){
			if(n==m) System.out.println("both are equal");
			else if(n<m) System.out.println(s+" comes before "+st);
			else  System.out.println(st+" comes before "+s);
			
			
		}

		
		
		
	 }
	 
}