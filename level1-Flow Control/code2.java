import java.util.Scanner;

class code2{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the first no");
	 int number1=sc.nextInt();
	 
	 System.out.println("enter the second no");
	 int number2=sc.nextInt();
	 
	 System.out.println("enter the third no");
	 int number3=sc.nextInt();
	 
	 
	 if(number1<number2&&number1<number3){
	 System.out.println("Yes");
	 }
	 else{
	 	 System.out.println("No");

	 }
	 
	 sc.close();
	}
}