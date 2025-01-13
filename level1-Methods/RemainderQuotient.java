import java.util.Scanner;

class RemainderQuotient{
public static int[] findRemainderAndQuotient(int number, int divisor) {
   
        int[] a= new int[2];
		
		a[0]=number/divisor;
		a[1]=number%divisor;
		 
		 return a;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the number");
		int n1=sc.nextInt();
		
		System.out.println("enter the  divisor");
		int n2=sc.nextInt();
		
	
	
		
		
		int[] arr=RemainderQuotient.findRemainderAndQuotient(n1,n2);
		
		System.out.println("the quotient is "+arr[0]+" and the remainder is "+arr[1]);
		
		sc.close();
		
		
   }
   
   
}