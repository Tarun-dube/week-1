import java.util.Scanner;

class code5{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the age");
	 int n=sc.nextInt();
	 
	 if(n>=18){
	 System.out.println("The person can vote");
	 }
	 else{
	 System.out.println("The person cannot vote");}
	 sc.close();
	}
}