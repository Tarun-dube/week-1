import java.util.Scanner;

class NumberType{
   public int type(int a){
           if (a>0)return 1;
		   else if(a<0) return -1;
		  return 0;
		  
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		
	
		
		
		//create object of class
		NumberType obj=new NumberType();
		
		//call  function
		 
		
		System.out.println(obj.type(a));
   }
   
   
}