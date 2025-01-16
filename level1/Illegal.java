import java.util.* ;


public class Illegal {
	
	
    public String illegal(String s,int i,int j){
		
		if(i>j || j>s.length()){ throw new IllegalArgumentException("the start index is greater than end index");}
		 String a=s.substring(i,j);
      
        // Throws string out of bound
        return a;
	}
	
	
	public void exceptionhandle(String s,int i,int j){
	 try{
			 Illegal obj=new Illegal();
		System.out.println(obj.illegal(s,i,j)); 
		 }
		 catch(IllegalArgumentException e)
		          { 
			 
		System.out.println("caught : IllegalArgumentException"+e.getMessage());
		 }
		 }
		 
		 
    public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	
		System.out.println("enter the String");
		 String s=sc.nextLine();
         
		 
		 System.out.println("enter the indexes");
		 int i=sc.nextInt();
		 int j=sc.nextInt();
		 
		 
		 Illegal obj=new Illegal();
		 
		 
		  obj.exceptionhandle(s,i,j);
		 
		// System.out.println(obj.illegal(s,i,j));
		
		 
		 
		 
	      
        
    }
}