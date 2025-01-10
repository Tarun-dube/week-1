import java.util.Scanner;

class code16{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	 

       
	 for(int i=1;i<=n;i++){
	  
	 if(i%2==0){System.out.println(i+" is even number");}
	 
	 
	 else{
		 System.out.println(i+" is odd number");
		 }
	 
	 }
	 
	  



	 sc.close();
	}
}