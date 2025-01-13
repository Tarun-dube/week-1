import java.util.Scanner;

class Wind{
public double calculateWindChill(double temperature, double windSpeed)
 {
   
      double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) *Math.pow(windSpeed,0.16);
	  return windChill;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the temperature");
		double n1=sc.nextDouble();
		
		System.out.println("enter the  wind speed");
		double n2=sc.nextDouble();
		
	
	
		
		Wind obj=new Wind();
		
		
		System.out.println("the wind chill is "+obj.calculateWindChill(n1,n2) );
		
		sc.close();
		
		
   }
   
   
}