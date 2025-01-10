import java.util.Scanner;

class code12{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	 int total=0;

      //sum using formula
     int sum=(n*(n+1))/2;	  
	 while(n>0){
	  
	 total+=n;
	 n--;
	 }
	 if (total==sum){
	  System.out.println("the values are equal i.e. "+total);
	}
	else{	  System.out.println("the values are not equal ");
}
	 sc.close();
	}
}