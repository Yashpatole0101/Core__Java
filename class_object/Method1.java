package class_object;
  class Student1{
	  String name;
	  int age;
	  int standard;
	  
	  void details() {
		  System.out.println("name of student: "+name);
		  System.out.println("age of student: "+age);
		 // System.out.println("standard: "+standard);
	  }
  }
public class Method1 {

	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.name="abc";
		s1.age=14;
		s1.standard=6;
		
		Student1 s2=new Student1();
		s2.name="pqr";
		s2.age=15;
		s2.standard=7;
		
         s1.details();
         s2.details();
	}

}
