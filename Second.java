package function_interface;

import java.util.function.Function;

public class Second {

	public static void main(String[] args) {
		Function<Integer,Boolean>fun=(t)->{
			return t%2==0;
		};
		
		System.out.println(fun.apply(12));

	}

}
