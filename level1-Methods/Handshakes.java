import java.util.Scanner;

class Handshakes{
   public int handshake(int n){
           int s=(n*(n-1))/2;
		   return s;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		System.out.println("enter the no of people");
		int n=sc.nextInt();
		
	
		
		
		//create object of class
		Handshakes Handshakes=new Handshakes();
		
		//call  function
		int s=Handshakes.handshake(n);
		
		System.out.println(s);
   }
   
   
}