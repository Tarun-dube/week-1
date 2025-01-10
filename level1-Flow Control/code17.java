import java.util.Scanner;

class code17{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the salary");
	  int n=sc.nextInt();
	  
	  System.out.println("enter the year of service");
	  int y=sc.nextInt();
	 

       if(y>5){
	   double bonus=(double)(n*5)/100;
	   	  System.out.println(bonus);

	   }
	   else{
	   	  System.out.println(0);

	   }
	 
	  



	 sc.close();
	}
}