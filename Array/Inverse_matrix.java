package Array;

public class Inverse_matrix {

	public static void main(String[] args) {
		int[][] arr= {{1,6,4,5},{4,8,3,7},{4,9,1,3},{0,1,6,3}};
		
		System.out.println("original matrix:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Inverse matrix:");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

	}}

}
