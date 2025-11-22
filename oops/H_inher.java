package oops;



class Vehicle{
	
	
	public void Info()
	{
		System.out.println("vehicles are used for travelling");
	}
	

	
}


class Four_wheeler extends Vehicle{
	public void Info()
	{
		System.out.println("having four wheels....");
	}
}


class Twowheeler extends Vehicle{
	 public void infoo()
	 {
		 System.out.println("having two wheels...");
	 }
}
public class H_inher {

	public static void main(String[] args) {
		
		
		Twowheeler yamaha= new Twowheeler();
		
		
		yamaha.Info();
		yamaha.infoo();
	
		
		
	}

}
