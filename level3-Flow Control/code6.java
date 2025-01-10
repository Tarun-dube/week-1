import java.util.Scanner;

class code6{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	 
	 
	  
	System.out.println("enter the first no");
	  double a=sc.nextDouble();
	  
	  System.out.println("enter the second no");
	  double b=sc.nextDouble();
	
	  
	  System.out.println("enter the operator");
	  String op=sc.next();
	  
	
	  switch(op){
	  case "+":
	      System.out.println(a+b);
	    break;
	   
	  case "-":
	     System.out.println(a-b);
	    break;
	  case "*":
	     System.out.println(a*b);
	    break;
		
	   case "/":
	     System.out.println(a/b);
	    break;
	  }
	

	
	
	
	 sc.close();
	}
}