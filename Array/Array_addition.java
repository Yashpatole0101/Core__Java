package Array;

public class Array_addition {

	public static void main(String[] args) {
		// addition of two matrix
		
		
		int[][] arr= {{2,3,5},{3,8,6},{8,5,7}};
		int[][] arr1= {{6,8,5},{3,7,1},{0,3,6}};
		
		int[][] final_matrix=new int[3][3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[1].length;j++)
			{
				final_matrix[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(final_matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
