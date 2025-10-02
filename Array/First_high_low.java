package Array;

public class First_high_low {

	public static void main(String[] args) {
		
		
		int num=Integer.MIN_VALUE;
		int[] arr= {32,65,89,22,56,9,12};
		System.out.println(num);
		for( int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			if(arr[i]>num)
			{
				num=arr[i];
				
			}
		}
        System.out.println("highest value in array is :" + num);
        
        
        //lowest value in array
        
        int num1=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]<num1)
        	{
        		num1=arr[i];
        	}
        }
        System.out.println("lowest value in array is :"+num1);
		
	}

}
