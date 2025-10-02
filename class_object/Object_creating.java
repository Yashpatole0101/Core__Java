package class_object;


class Student{
	String name;
	int age;
}
class Car{
	String names;
	double price;
}






public class Object_creating {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="yash";
		s1.age=21;
		
		
		System.out.println("name is "+s1.name);
		System.out.println("age is "+s1.age);
		
		
		
		Car c1=new Car();
		
		c1.names="BMW";
		c1.price=57378902;
		
		
		Car c2=new Car();
		c2.names="VFUO";
		c2.price=567821982;
		
		
		System.out.println("name of car is "+c1.names);
		
		
		
		
	}
	
}
