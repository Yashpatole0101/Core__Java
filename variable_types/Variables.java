package variable_types;
   

class Car{
	int price;
	String name;
	 final static  int wheels=4;
	
	public void Details() {
		int x=98;
		
		System.out.println("name of car is:"+name);
		System.out.println("price of car is:"+price);
		System.out.println("wheels:"+wheels);
		//System.out.println(x);
	}
	
	
	
}
public class Variables {

	public static void main(String[] args) {
		Car c1= new Car();
		c1.name="BMW";
		c1.price=4367976;
		
		
		Car c2=new Car();
		c2.name="ODI";
		c2.price=4689223;
		
		
		c1.Details();
		c2.Details();

	}

}
