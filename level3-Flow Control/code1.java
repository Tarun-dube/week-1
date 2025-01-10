import java.util.Scanner;

class code1{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	
	int num=n;
	int sum=0;
	while(num!=0){
	 int i=num%10;
	 sum+=Math.pow(i,3);
	 num/=10;
	}
	
	if(sum==n)System.out.println("This number is Armstrong number");
	else System.out.println("This number is not Armstrong number");
	
	
	
	 sc.close();
	}
}