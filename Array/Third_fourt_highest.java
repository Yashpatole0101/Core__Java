package Array;

public class Third_fourt_highest {

	public static void main(String[] args) {
		int f=0;
		int s=0;
		int t=0;
		int fo=0;
		
		
		int[] arr= {4,64,13,68,90,23,56,84};
		
		for( int i=0;i<arr.length;i++)
		{ 
			if(arr[i]>f)
			{
				s=f;
				f=arr[i];
			}
			
			if(arr[i]>s && arr[i]<f )
			{
				t=s;
				s=arr[i];
			}
			
			if(arr[i]>t && arr[i]<s)
			{
				fo=t;
				t=arr[i];
			}
			
			if(arr[i]>fo && arr[i]<t)
			{
				fo=arr[i];
			
			}
			
			
					}
System.out.println(f);
System.out.println(s);
System.out.println(t);
System.out.println(fo);
}
}