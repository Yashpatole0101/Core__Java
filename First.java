package function_interface;

import java.util.function.Function;

public class First {

	public static void main(String[] args) {
		Function<String,Integer>fun =(t)->{
			return t.length();
		};
		
		System.out.println(fun.apply("sdfgvgbg"));
	}

}
