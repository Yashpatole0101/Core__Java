package jumpingstatements;

public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("********************");
		
		
		int j=1;
		while(j<=10)
		{
			
			if(j%3==0)
			{
				j++;
				continue;
				
			}
			System.out.println(j);
			j++;
	}	
     
		
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
