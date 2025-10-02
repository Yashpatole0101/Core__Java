package Array;

public class Upper_matrix {
	public static void main(String[] args) {
		
		int num=0;
		int[][] arr=new int[4][4];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j<i)        //for upper trigular matrix
				{
					arr[i][j]=0;
					
				}
				else
				{
					arr[i][j]=num;
					num++;
				}
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("*********************");
			int num1=1;	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j>i)        //for lower trigular matrix
				{
					arr[i][j]=0;
					
				}
				else
				{
					arr[i][j]=num1;
					num1++;
				}
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
