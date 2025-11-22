package oops;



// abstract class(responsible for partial abstraction)

abstract class Myclass
{
	public void display()
	{
		System.out.println("good morning!!!");
	}
	
	abstract public  void launchRocket();
}


class Childclass extends Myclass
{
	  public void launchRocket()
	{
		System.out.println("rocket is launched from NASA");
	}
}



public class Abstraction {

	public static void main(String[] args) {
		
		Childclass c1=new Childclass();
		c1.display();
		c1.launchRocket();
		
	System.out.println("********************************");	
		
		//polymorphic object
	
	Myclass c2=new Childclass();
	
	c2.display();
	c2.launchRocket();
	

	}

}
