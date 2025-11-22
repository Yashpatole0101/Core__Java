package oops;
//runtimepolymorphism,dynamic polymorphism,method-overridding


class Car{
	
	
	public void details()
	{
		System.out.println("having four wheels");
	}
}


class Bmw extends Car
{
	public void details()
	{   
		System.out.println("expensive car");
	}
}
public class Methodoverride {

	public static void main(String[] args) {
		
		Bmw bmw= new Bmw();
		
		bmw.details();
		
		
		//dyanamic method dispatch
		Car c=new Bmw();   //polymorphic object
		
		
		c.details();
		
		
	}

}
