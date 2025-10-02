package Array;

public class Two_d2 {

	public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int num=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					arr[i][j]=num;
					num++;
				}
				else
				{
				arr[i][j]=0;
				
			}
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
			}
	}

}
