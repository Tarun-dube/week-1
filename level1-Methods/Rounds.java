import java.util.Scanner;

class Rounds{
   public double round(int a,int b,int c){
           
		   double perimeter=a+b+c;
		   
		   double r=5000/perimeter;
		   
		   return r;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		System.out.println("enter the first side");
		int a=sc.nextInt();
		System.out.println("enter the second side");
		int b=sc.nextInt();
		System.out.println("enter the third side");
		int c=sc.nextInt();
		
	
		
		
		//create object of class
		Rounds obj=new Rounds();
		
		//call  function
		double s=obj.round(a,b,c);
		
		System.out.println(s);
   }
   
   
}