package oops;



class A
{
	public void show()
	{
		System.out.println("a is printed");
	}
	
}


class B
{
	public void show()
	{
		System.out.println("b is printed");
	}
}


class C extends A
{
	
}
public class Diamond_problem {

	public static void main(String[] args) {

     C C1=new C();
     C1.show();

	}

}
