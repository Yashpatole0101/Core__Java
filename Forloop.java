package loopingstatements;

public class Forloop {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			System.out.println("hello");
			
		} 
		
		//table of 12
		
		int num=12;
		for( int j=1;j<=10;j++) {
			System.out.println(num+"*"+j+"="+(num*j));
		}

		
		//even/odd progeam using for loop plus sumation of even numbers
		
		int sum=0;
		for(int i=0;i<=5;i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
				sum=sum+i;
			}
			else {
				System.out.println(i+" is odd");
			}
		}
		System.out.println("sum of even no:"+sum);
		
	}

}
