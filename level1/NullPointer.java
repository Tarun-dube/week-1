public class NullPointer {
	
	
    public int nullpointer(){
		// Reference set to null
        String text = null; 
      
        // Throws NullPointerException
        return(text.length()); 
	}
	public void exceptionhandle(){
		 NullPointer obj=new NullPointer();
	         try{
			
		System.out.println(obj.nullpointer()); 
		 }
		 catch(NullPointerException e)
		           {
			 
		System.out.println("caught : Null pointer Exception");
		 }
		 }
	
    public static void main(String[] args) {
        NullPointer obj=new NullPointer();
		 
		 obj.exceptionhandle();
		
        
    }
}