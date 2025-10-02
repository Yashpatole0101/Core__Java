package Array;

public class Two_d {

	public static void main(String[] args) {
		
		
		int[][] arr= new int[2][2];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		
		
		System.out.println("length of 2D array is:"+arr.length);   // number of rows..
		
		System.out.println("value at arr[0][1] is :"+arr[0][1]);
		
		System.out.println("************************");
		System.out.println("2D Array is:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
