package oops;


//100% abstraction
//variables are public static final
//methods are public abstract


 interface Shape1
{
	
	
	public void cal_area(int r);
	
	
}
 
 class Circle1 implements Shape1
 {
	 public void cal_area(int r) {
		 System.out.println("area of circle is :"+(Math.PI*r*r));
	 }
 }

public class Abstraction1 {

	public static void main(String[] args) {
		
		
		
		
		Circle1 c1=new Circle1();
		c1.cal_area(2);
		

	}

}
