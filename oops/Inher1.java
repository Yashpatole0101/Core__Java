package oops;

class Animal{
	
	
	public void animal()
	{
		System.out.println("Wild animal!!!");
	}
	
	
	public void place() {
		System.out.println("in jungle ");
	}
}

class Tiger extends Animal {
	 
	
	
	public void food() {
		System.out.println("meat");
	}
}




public class Inher1 {

	public static void main(String[] args) {
		
		Tiger t1=new Tiger();
		t1.animal();
		t1.food();
		t1.place();

	}

}
