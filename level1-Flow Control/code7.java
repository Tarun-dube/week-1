import java.util.Scanner;

class code7{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user month
	 System.out.println("enter the month");
	 String month=sc.nextLine();
	 
	 System.out.println("enter the day");
	 int day=sc.nextInt();
	 
	 
	 
	 
	 if(month.equals("April")||month.equals("May")){
	 System.out.println("Its a Spring Season");
	 } 
	 else if(month.equals("March") && day>=20){
	 System.out.println("Its a Spring Season");
	 } 
	 else if(month.equals("June") && day<=20){
	 System.out.println("Its a Spring Season");
	 }
	 else{
	 	 System.out.println("Not a Spring Season");

	 }
	 
	 sc.close();
	}
}