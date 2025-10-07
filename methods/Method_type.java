package methods;

class Student{
	String name;
	int rollno;
	int score;
	static int i;  
	
	public void show() //instance method
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(score);
		
		
	}
	public static void  details()  // static method
	{
		System.out.println(i);
		
	}
}
public class Method_type {

	public static void main(String[] args) {
		Student.i=23;       //assiging using class name due to static variable
		
		
		Student s1=new Student();
		s1.name="yash";
		s1.rollno=15;
		s1.score=78;
		
		s1.show();
		s1.details();
		
		System.out.println("******************");
		
		Student s2=new Student();
		s2.name="anand";
		s2.rollno=25;
		s2.score=79;
		s2.show();
		s2.details();
	}

}
