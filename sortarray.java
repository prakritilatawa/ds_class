package data;
import java.util.*;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,50,30,10,40};
		
		//bubble sort
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1; j<a.length-1;j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
		
		//without bubble sort
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]+" ");
		
	}

}