import java.util.Scanner;

class code8{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 System.out.println("enter the no");
	 int n=sc.nextInt();
	 
	while(n>=1){
	System.out.println(n);
	n--;
	}
	 sc.close();
	}
}