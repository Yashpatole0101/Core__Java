package oops;

class Shape{
	public void  show()
	{
		System.out.println("shapes!!!!!!!!!");
	}
}

class Triangle extends Shape
{
	public void details() {
		System.out.println("this is a triaganle");
	}
}

class Eq_trianle extends Triangle
{
	public void area(int i,int j)
	{
		
		double result= ((i*j)/2);
		System.out.println("are of E_t is "+result);
	}
}



public class M_inter {

	public static void main(String[] args) {
		
		Eq_trianle t=new Eq_trianle();
		t.show();
		t.details();
		t.area(2, 8);
		
	}

}
