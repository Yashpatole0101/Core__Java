package day3;

public class Switch_case {

	public static void main(String[] args) {
		int i=3;
		switch(i)
		{
		case 1:
		{
			System.out.println("no is 1");
			break;
		}
		case 2:
		{
			System.out.println("number is 2");
			break;
		}
		case 3:
		{
			System.out.println("number is 3");
			break;
		}
		case 4:
		{
			System.out.println("number is 4");
			break;
		}
		default:
		{
			System.out.println("other number");
		}

	}
		
		
		
		//weeks of day....
		
		String day="wendesday";
		switch(day)
		{
		case "monday":
		{System.out.println("today is monday");
		break;
		}
		
		case "tuesday":
		{
			System.out.println("today is tuesday");
			break;
		}
		case "wendesday":
		{
			System.out.println("today is wednesday");
			break;
		}
		case "thursday":
		{
			System.out.println("today is thursday");
			break;
		}
		case "friday":
		{
			System.out.println("today is friday");
			break;
		}

}  
		
		
		//calculator 
		
		int a=10;
		int b=15;
		char op='*';
		switch(op)
		{
		case '+':
		{
			System.out.println(a+b);
			break;
			
		}
		case '-':
		{
			System.out.println(a-b);
			break;
		}
		case '*':
		{
			System.out.println(a*b);
			break;
		}
		case '/':
		{
			if(b!=0)
			{
				System.out.println(a/b);
			}
			else
			{
				System.out.println("cant divisible by zero");
			} break;
			
		}
		
		}
		
		
		//even odd
		for(i=1;i<=10;i++) {
			switch(i%2)
			{
			case 0:
			{System.out.println("even:"+i);
			break;
			}
			
			case 1:
			{
				System.out.println("odd:"+i);
				break;
			}
		}
		}}}
