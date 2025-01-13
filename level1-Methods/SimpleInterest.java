import java.util.Scanner;

class SimpleInterest{
   public double simpleInterest(int principal,int rate,int time){
           double si=(double)(principal*rate*time)/100;
		   return si;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		System.out.println("enter the principal");
		int p=sc.nextInt();
		
		System.out.println("enter the rate");
		int r=sc.nextInt();
		
		System.out.println("enter the time");
		int t=sc.nextInt();
		
		
		//create object of class
		SimpleInterest SimpleInterest=new SimpleInterest();
		
		//call simpleInterest function
		double s=SimpleInterest.simpleInterest(p,r,t);
		
		System.out.println(s);
   }
   
   
}