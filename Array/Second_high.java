package Array;

public class Second_high {

	public static void main(String[] args) {
		int first= Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		int[] arr= {23,8,45,98,12,54,21};
		
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
				
			}
			if(arr[i]>second && arr[i]<first)
			{
				second=arr[i];
			}
		}
		
		System.out.println("second highest value in array is:"+second);

	}

}
