import java.util.* ;

public class StringIndex {
	
	
    public char stringout(String s,int i){
		 
      
        // Throws string out of bound
        return(s.charAt(i)); 
	}
	
	
	public void exceptionhandle(String s,int i){
	 try{
			 StringIndex obj=new StringIndex();
		System.out.println(obj.stringout(s,i)); 
		 }
		 catch(StringIndexOutOfBoundsException e)
		          { 
			 
		System.out.println("caught : StringIndexOutOfBoundsException"+e.getMessage());
		 }
		 }
		 
		 
    public static void main(String[] args) {
		System.out.println("enter the String");
         StringIndex obj=new StringIndex();
		
		 Scanner sc=new Scanner(System.in);
		 
		 String s=sc.nextLine();
		  System.out.println("enter the index");
		 int i=sc.nextInt();
		  obj.exceptionhandle(s,i);
		 
		 //System.out.println(obj.stringout(s,i));
		
		 
		 
		 
	      
        
    }
}