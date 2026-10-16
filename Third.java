package function_interface;

import java.util.function.Function;

public class Third {

	public static void main(String[] args) {
		Function<String,Integer> con=(t)->{
			return t.length();
		};
		Function<Integer,Boolean> con1=(t)->{
			return t%2==0;
		};
		
		Function<String,Boolean>con3=con1.compose(con);
		System.out.println(con3.apply("hello"));
	}

}
