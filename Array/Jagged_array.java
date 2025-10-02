package Array;

public class Jagged_array {

	public static void main(String[] args) {
		int[][] arr= new int[3][];
		arr[0]=new int [4];
		arr[1]=new int[4];
		arr[2]=new int[4];
		
		
		int sum=0;
		int counter=1;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=counter;
				counter++;
			
				
				sum+=arr[i][j];
				
				
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			
		}
		
          System.out.println("sum of array is:"+sum);
          
          
          
          for(int i=0;i<arr.length;i++)
  		{
  			for(int j=0;j<arr[i].length;j++)
  			{ 
  				
  				if(i==j)
  				{
  					sum1+=arr[i][j];
  				}
	}

}
          System.out.println("sum of diagonal values is:"+sum1);
          
	
	}}
