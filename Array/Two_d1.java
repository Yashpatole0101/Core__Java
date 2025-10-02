package Array;

public class Two_d1 {

	public static void main(String[] args) {
		int num=1;
		int[][] arr=new int[3][3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=num;
				num++;
			}
		}

		
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			     System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("**********************");
		
		
		/**
		 * print 9 8 7
		 *       6 5 4
		 *       3 2 1
		 * 
		 */
	
		int num1=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=num1;
				num1--;
			}
		}

		
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			     System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		/**
		 * for making diagonal element one
		 */
		
		int a=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					arr[i][j]=1;
				}
			
				else
				{
				arr[i][j]=a;
				a++;
				}
			
		}
		}

		
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			     System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("**********");
		/**  
		 * for 1 0 0
		 *     0 1 0
		 *     0 0 1
		 */
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					arr[i][j]=1;
				}
				else
				{
				arr[i][j]=0;
				
			}
		}}

		
		

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