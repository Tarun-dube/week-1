import java.util.Scanner;

class code3{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the first no");
	 int number1=sc.nextInt();
	 
	 System.out.println("enter the second no");
	 int number2=sc.nextInt();
	 
	 System.out.println("enter the third no");
	 int number3=sc.nextInt();
	 
	 
	 if(number1>number2&&number1>number3){
	 System.out.println("First no is largest");
	 }
	 else if(number2>number1&&number2>number3){
	 System.out.println("second no is largest");
	 }
	 else{
	 	 System.out.println("Third no is largest");

	 }
	 
	 sc.close();
	}
}