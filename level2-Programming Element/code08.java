import java.util.Scanner;

class operator{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	//name and city visited
	System.out.println("enter the name");
	String name=sc.nextLine();
	
	System.out.println("enter the from city");
	String fromCity=sc.nextLine();
	
	System.out.println("enter the via city name");
	String viaCity=sc.nextLine();
	
	System.out.println("enter the to city");
	String toCity=sc.nextLine();
	
	
	// distances between city
	System.out.println("enter the distance from to via city");
	int b=sc.nextInt();
	
	System.out.println("enter the distance from via to final city");
	int c=sc.nextInt();
	
	//time taken
	System.out.println("enter the time taken from to via ");
	int t1=sc.nextInt();
	
	System.out.println("enter the time taken form via to final");
	int t2=sc.nextInt();
	
	
	
	
	
	//output
	System.out.println(name+" visited from "+fromCity+" to "+toCity+" via "+viaCity+
	" and the distance from "+fromCity+" to "+viaCity+" and "+viaCity+" to "+toCity+" are "+b+"km and "+c+
	"km and "+"time taken are "+t1+"hr and "+t2+"hr");
	
	sc.close();
	
	}
}