import java.util.*;


public class Anagram{


   static boolean areAnagrams(String s1, String s2) {
        
        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }
	
	
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first string");
		String s=sc.nextLine();
		
		System.out.println("enter the  second string");
		String c=sc.nextLine();
		
		
		

        System.out.println(Anagram.areAnagrams(s,c));
		
		
		
	 }
	 
}