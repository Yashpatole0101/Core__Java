package conditionalstatements;

public class if_statement {
public static void main(String[]args) {
	
	
	int a=18;
	if(a<19)
	{
		System.out.println("a is less then 19");
	}
	
	
	
	
	String name="ya";
	if(name.length()<3||name.length()>15)
{
		System.out.println("name must contain atleast 3 and max. 15 character");
		return;
	}
	System.out.println("name is correct!");

	
	
	
}

}

