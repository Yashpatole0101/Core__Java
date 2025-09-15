package conditionalstatements;

public class Else_if {

	public static void main(String[] args) {     
	   
	int num=0;
	if(num>0)
	{
		System.out.println("num is positive..");
	
	}
	else if(num<0)
	{ 
		System.out.println("num is negative..");
	}
	else {
		System.out.println("num is zero");
	}
	
	     
	
	
	//grading system
	
	double marks=67.98;
	
	if(marks>=35&&marks<=45)
	{
		System.out.println("third class");
	}
	else if(marks>45&&marks<=60) {
		System.out.println("second class");
	}
	else if(marks>60&&marks<=85) {
		System.out.println("first class");
	}
	else if(marks>85&&marks<=100) {
		System.out.println("destinsation");
	}
	else {
		System.out.println("student is fail");
	}
	
	
	
	//market discount system
	
	double price=10000;
	if (price>=3000&&price<=5000) {
		System.out.println("5% discount");
		double discount=price*0.05;
		System.out.println(discount);
		double final_amount=price-discount;
		System.out.println("final amount to pay:"+final_amount);
		
	}
	else if(price>5000&&price<=10000) {
		System.out.println("10% discount");
		double discount=price*0.10;
		System.out.println(discount);
		double final_amount=price-discount;
		System.out.println("final amount to pay:"+final_amount);
		
	}
	else if(price>10000&&price<=20000) {
		System.out.println("20% discount");
		double discount=price*0.20;
		System.out.println(discount);
		double final_amount=price-discount;
		System.out.println("final amount to pay:"+final_amount);
		
	}
	else if(marks>20000) {
		System.out.println("high discount pius special gift ");
		
	}
	else {
		System.out.println("no discount");
	}
	}
}