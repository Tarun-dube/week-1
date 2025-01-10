import java.util.Scanner;

class code15{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	 int total=1;

      
	 for(int i=n;i>0;i--){
	  
	 total*=i;
	 
	 }
	 
	  System.out.println(total);



	 sc.close();
	}
}