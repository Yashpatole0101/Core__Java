package Array;

public class Two_d3 {

	public static void main(String[] args) {
		// sum all elements
		
		int num=1;
		int sum=0;
		int[][] arr=new int[3][3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=num;
				num++;
				
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println();
		}
        System.out.println("sum of all elements in matrix: "+sum);
	}

}
