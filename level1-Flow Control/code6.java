import java.util.Scanner;

class code6{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the no");
	 int n=sc.nextInt();
	 
	 if(n==0){
	 System.out.println("zero");
	 }
	 else if(n>0){
	 System.out.println("positive");
	 }
	 else{
	 System.out.println("negative");}
	 sc.close();
	}
}