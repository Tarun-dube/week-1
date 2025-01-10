import java.util.Scanner;

class code10{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	
	 int total=0; 
	 while(total>=0){
	  System.out.println("enter the no");
	  int n=sc.nextInt();
	  
	  if(n==0){break;}
	  else{
	  total+=n;
	  }
	 }
	  System.out.println("the total value is "+total);
	
	 sc.close();
	}
}