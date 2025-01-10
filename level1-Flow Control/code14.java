import java.util.Scanner;

class code14{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	 int total=1;

        
	 while(n>0){
	  
	 total*=n;
	 n--;
	 }
	 
	  System.out.println(total);



	 sc.close();
	}
}