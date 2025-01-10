import java.util.Scanner;

class code2{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	
	int num=n;
	int sum=0;
	while(num!=0){
	 
	 sum++;
	 num/=10;
	}
	  if(n==0)System.out.println(1);
      else System.out.println(sum);

	
	
	
	 sc.close();
	}
}