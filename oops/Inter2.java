package oops;




class Student{
	
	String name;
	int age;
	static String  u_name="Sppu";
	
	public Student() {
		System.out.println("parent class constructor");
	}
	public Student(int i) {
	System.out.println("hjk");
	}

	
	
	public void display()
	{
		System.out.println("student is studing!!!");
	}
	
	public void showdetails()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("university name is "+u_name);
	}
	
	
}


class Yash extends Student{
	
	public Yash(String name,int age)
	{   super();
		this.name=name;
		this.age=age;
		System.out.println("************************************");
	}
	
	public Yash() {
		
		super(1);
		
	}
	
	
}
public class Inter2 {

	public static void main(String[] args) {
		
		Yash y=new Yash();
		
		Yash y1=new Yash("patole",12);
		y1.display();
		y1.showdetails();
	



	}

}
