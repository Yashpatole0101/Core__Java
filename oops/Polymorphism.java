package oops;


//methodoverloading/compile-time polymorphism,static polymorphism
class Student1{
	String name;
	int rollno;
	
	public void info(String name) {
		this.name=name;
	}
	
	public void info(int rollno) {
		this.rollno=rollno;
	}
	
	public void info()
	{
		System.out.println("name is: "+name);
		System.out.println("rollno is: "+rollno);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		
		Student1 s1=new Student1();
		s1.info("yash");
		s1.info(15);
		s1.info();
		
		
		

	}

}
