import java.util.Scanner;

class Spring{
   public boolean season(String a ,int day){
           
		   if(a.equals("April") || a.equals("May")) return true;
		   else if(a.equals("March") && day>=20) return true;
		   else if(a.equals("June") && day<=20) return true;
		   
		 return false; 
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		System.out.println("enter the Month");
		String m=sc.nextLine();
		
		System.out.println("enter the day");
		int d=sc.nextInt();
		
	
		
		
		//create object of class
		Spring obj=new Spring();
		
		//call  function
		 
		
		if(obj.season(m,d)) System.out.println("It is spring season");
		else System.out.println("It is not spring season");
   }
   
   
}