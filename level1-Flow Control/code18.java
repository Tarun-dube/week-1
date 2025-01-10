import java.util.Scanner;

class code18{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	 
       int total;
      
	 for(int i=1;i<=9;i++){
	  
	 total=n*i;
	 if(i>=6&&i<=9){
	 System.out.println(total);
	 }
	 
	 }
	 
	  



	 sc.close();
	}
}