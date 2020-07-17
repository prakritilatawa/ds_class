package data;

public class maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,50,30,10,40};
		int max= a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}

}