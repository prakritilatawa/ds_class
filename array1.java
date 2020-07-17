package data;
import java.util.*;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a= new int[n];
	        for(int i= 0;i< n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        scan.close();

	        // Prints each sequential element in array a
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	}

}