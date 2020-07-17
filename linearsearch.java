package data;
import java.util.*;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int c, n, search, a[];  
		   
		    Scanner in = new Scanner(System.in);   
		    n = in.nextInt();   
		    a= new int[n];  
		   
		   
		    for (c = 0; c < n; c++)  
		      a[c] = in.nextInt();  
		   
		    System.out.println("Enter value to find");  
		    search = in.nextInt();  
		   
		    for (c = 0; c < n; c++)  
		    {  
		      if (a[c] == search) 
		      {  
		         System.out.println(search + " is present at location " + (c + 1) + ".");  
		          break;  
		      }  
		   }  
		   if (c == n)  
		      System.out.println(search + " is not present in array.");  
		  }  
	

}
