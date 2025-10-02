package Array;

public class Logical_array_assisgning {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int n=arr.length;
		for( int i=0;i<n;i++)
		{
			arr[i]=i+2;
			System.out.println(arr[i]+" ");
		}
	
    int sum=0;
    for( int i=0;i<n;i++)
    {
    	sum=sum+arr[i];
    	
    }
    System.out.println("sum of array is:"+sum);
    double average=sum/n;
    System.out.println("average of array is :"+average);
}
	}