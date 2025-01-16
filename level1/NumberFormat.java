import java.util.* ;

public class NumberFormat{
	
	
    public int numberformat(String s){
		 
      
        // Throws string out of bound
        return Integer.parseInt(s);
	}
	
	
	public void exceptionhandle(String s){
	 try{
			 NumberFormat obj=new NumberFormat();
		System.out.println(obj.numberformat(s)); 
		 }
		 catch(NumberFormatException e)
		          { 
			 
		System.out.println("caught : NumberFormatException "+e.getMessage());
		 }
		 }
		 
		 
    public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	
		System.out.println("enter the String");
		 String s=sc.nextLine();
         
		 
		 ;
		 
		 
		 NumberFormat obj=new NumberFormat();
		 
		 
		  obj.exceptionhandle(s);
		 
		 //System.out.println(obj.illegal(s));
		
		 
		 
		 
	      
        
    }
}