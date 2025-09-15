package conditionalstatements;

public class If_else {

	public static void main(String[] args) {
		int age=2;
		if(age>=18) {
			System.out.println("user can vote..");
			
		}
		else {
			System.out.println("user cant vote...");
		}

		
		
		
		String username="yash";
		String password="yash0101";
		if(username.equals("yash")&&password.equals("yash0101"))
		{
			System.out.println("login successfully!!");
		}
		else {
			System.out.println("login failed!!");
		}
		
	}

}
