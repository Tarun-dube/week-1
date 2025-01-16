import java.util.* ;

public class ArrayIndex{
	
	
    public int arrayindex(int[] a,int i){
		 
      
        // Throws string out of bound
        return a[i];
	}
	
	
	public void exceptionhandle(int[] a,int i){
	 try{
			 ArrayIndex obj=new ArrayIndex();
		System.out.println(obj.arrayindex(a,i)); 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		          { 
			 
		System.out.println("caught : ArrayIndexOutOfBoundsException "+e.getMessage());
		 }
		 }
		 
		 
    public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
			System.out.println("size of array");
	       int n=sc.nextInt();
		   
		   
		   System.out.println("enter the elements");
	int[] a=new int[n];
	
		 for(int i=0;i<n;i++){
		 a[i]=sc.nextInt();
		 }
		 System.out.println("enter the index");
	       int i=sc.nextInt();
		 
		 ArrayIndex obj=new ArrayIndex();
		 
		 
		  obj.exceptionhandle(a,i);
		 
		 //System.out.println(obj.illegal(a,i));
		
		 
		 
		 
	      
        
    }
}