package Array;

public class array_initializing {

	public static void main(String[] args) {
		// first method
		
		int[] arr= {6,2,9,2,9,4,};
		System.out.println(arr.length);
		System.out.println(arr[2]);
		
		
		
		//second method
		int[] arr1=new int[] {1,3,7,4,3,2,4};
		System.out.println("lenth of arr1 is:"+arr1.length);
		
		
		
		//third method
		int[] arr2=new int[6];
		System.out.println(arr2[3]);
		
		arr2[0]=1;
		arr2[1]=3;
		arr2[3]=5;
		System.out.println(arr2[3]);
		for( int i=0;i<arr2.length;i++)   //for printing whole array
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
