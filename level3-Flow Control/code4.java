import java.util.Scanner;

class code4{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	
	int sum=0;
	for(int i=1;i<=n/2;i++){
	if(n%i==0)sum+=i;
	}
	
	  if(sum>n)System.out.println("Abundant Number");
      else System.out.println("Not an Abundant Number");

	
	
	
	 sc.close();
	}
}