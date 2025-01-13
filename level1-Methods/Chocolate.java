import java.util.Scanner;

class Chocolate{
public static int[] numberOfChocolate(int number, int child) {
   
        int[] a= new int[2];
		
		a[0]=number/child;
		a[1]=number%child;
		 
		 return a;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the number of chocolate");
		int n1=sc.nextInt();
		
		System.out.println("enter the  no of child");
		int n2=sc.nextInt();
		
	
	
		
		
		int[] arr=Chocolate.numberOfChocolate(n1,n2);
		
		System.out.println("the number of chocolates each child gets is "+arr[0]+" and the remaining chocolate is "+arr[1]);
		
		sc.close();
		
		
   }
   
   
}