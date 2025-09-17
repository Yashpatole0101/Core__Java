package day3;

public class While_loop {

	public static void main(String[] args) {
		boolean flag=true;
		while(flag==true) 
		{
			flag=false;
			System.out.println("hii");
			
		}
		
		
		int num=1;
		while(num<=10)
		{
			System.out.println(num);
			num++;
		}
		
		
		//divisible by 10
		
		int numm=1;
		while(numm<=1000)
		{
			if(numm%10==0)
			{
				System.out.println(numm+"is divisible by 10..");
			}
			numm++;
		}
		
		
		//table from 1 to 10
		int i=1;
		while(i<=10)
		{
			int j=1;
			while(j<=10)
			{
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
				
			}System.out.println("***********************8");
			i++;
		}

	}

}
