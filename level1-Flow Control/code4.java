import java.util.Scanner;

class code4{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the no");
	 int n=sc.nextInt();
	 
	 if(n>0){
	 int sum=(n*(n+1))/2;
	 System.out.println("The sum of "+n+" natural no is "+sum);
	 }
	 else{
	 System.out.println("The number "+n+" is not a natural no");}
	 sc.close();
	}
}