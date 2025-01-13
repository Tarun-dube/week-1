import java.util.Scanner;

class Sum{
   public int sum(int n){
   int sum=0;
   if(n<0) return -1;
   for(int i=1;i<=n;i++){
   sum+=i;
   }
   return sum;
         
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the no");
		int n=sc.nextInt();
		
	
		
		
		//create object of class
		Sum obj=new Sum();
		
		//call  function
		 
		
		if(obj.sum(n)==-1) System.out.println("not a natural no");
		else System.out.println(obj.sum(n));
   }
   
   
}