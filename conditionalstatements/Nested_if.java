package conditionalstatements;

public class Nested_if {

	public static void main(String[] args) {
		int a=10;
		if(a>0) {
			System.out.println("a is greater then zero..");
			if(a==10)
			{
				System.out.println("a is 10");
				
			}
			else {
				System.out.println("a is not 10");
			}
		}
		else {
			System.out.println("a is less then 10");
		}
		
		
		//checking eligibility for practical examination...
		
		double presenti=77.98;
		int insem_marks=15;
		int assign=6;
		
		if(presenti>=75) {
			System.out.println("no presenti issue ");
			if(insem_marks>=12) {
				System.out.println("no  marks issue");
			}
//			else {
//				System.out.println("practical is back due to less marks");
//			}
			if(assign>=5)
			{
				System.out.println("all assigments is completed so no issue ");
			}
//			else {
//				System.out.println("assidnment is not completed");
//			}
		}
		else {
			System.out.println("practical is back due to less presenti!!");
		}
		
		
		//Bank ATM Withdrawal
		int pin=1212;
		double balance=100;
		double withdrawal=500;
		if(pin==1212)
		{
			System.out.println("correct pin!!");
			if(balance>=withdrawal)
			{
				System.out.println("withdrawal successfully");
				double final_amount=balance-withdrawal;
				System.out.println("remeining amount:"+final_amount);
			}
		
		else {
			System.out.println("insuffient balance");
		}

	}
	

}}
