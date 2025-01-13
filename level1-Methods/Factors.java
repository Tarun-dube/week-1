import java.util.Scanner;

class Factors{

//factors array
public static int[] factors(int number) {
	    int count=0;
		for(int i=1;i<=number;i++){
			if(number%i==0)count++;
			
		}
   
        int[] a= new int[count];
		int index=0;
		for(int i=1;i<=number;i++){
		if(number%i==0) a[index++]=i;
		}
	
		 
		 return a;
   }
   
   //sum of array
   public int sumArray(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
      }
      return sum;
   }
   
   //sum of square
   public int sumSquare(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += Math.pow(array[i],2);
      }
      return sum;
   }
   
   //product of square
   public int product(int[] array) {
      int sum = 1;
      for (int i = 0; i < array.length; i++) {
         sum *= array[i];
      }
      return sum;
   }
   
   
   
   
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the number ");
		int n1=sc.nextInt();
		
		
		int[] arr=Factors.factors(n1);
		
		//create obj
		Factors obj=new Factors();
		int sum=obj.sumArray(arr);
		int pro=obj.product(arr);
		int square=obj.sumSquare(arr);
		
		
		
		System.out.println("the factors are ");
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
		System.out.println("the sum is "+sum+", the product is "+pro+" and the sum of square is "+square);
		sc.close();
		
		
   }
   
   
}