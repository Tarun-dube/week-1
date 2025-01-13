import java.util.Scanner;

class SmallestLargest{
   public static int[] findSmallestAndLargest(int number1, int number2, int number3){
   
        int[] a= new int[2];
		
		if(number1<number2 && number1<number3) a[0]=number1;
		 else if(number2<number1 && number2<number3) a[0]=number2;
		 else if(number3<number1 && number3<number2) a[0]=number3;
         
		 if(number1>number2 && number1>number3) a[1]=number1;
		 else if(number2>number1 && number2>number3) a[1]=number2;
		 else if(number3>number1 && number3>number2) a[1]=number3;
		 
		 return a;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the first no");
		int n1=sc.nextInt();
		
		System.out.println("enter the second no");
		int n2=sc.nextInt();
		
		System.out.println("enter the second no");
		int n3=sc.nextInt();
	
		
		
		int[] arr=SmallestLargest.findSmallestAndLargest(n1,n2,n3);
		
		System.out.println("the smallest number is "+arr[0]+" and the largest number is "+arr[1]);
		
		sc.close();
		
		
   }
   
   
}