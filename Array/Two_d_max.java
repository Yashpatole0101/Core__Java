package Array;

public class Two_d_max {

	public static void main(String[] args) {
		// maximun number in matrix
		
		int num=1;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int[][] arr=new int[3][3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=num;
				num++;
				
				System.out.print(arr[i][j]+" ");
				
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
				
				// for minimum number
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("maximum number in matrix is:"+max);
		System.out.println("minimum value in matrix is:"+min);

	}

}
