import java.util.Scanner;

class code1{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the no");
	 int n=sc.nextInt();
	 
	 if(n%5==0){
	 System.out.println("Is the number "+n+" divisible by 5?" +"Yes");
	 }
	 else{
	 System.out.println("no");}
	 sc.close();
	}
}