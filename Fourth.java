package function_interface;

import java.util.function.Function;

public class Fourth {
       char[] ch= {'g','o','o','d'};
	public static void main(String[] args) {
		Function<Character[],String> fun1=(t)->{
			String s=new String();
			for(char i:t) {
				s=s+i;
			}
			return s;
		};
		
		Function<String,Integer>fun2=(v)->{
			return v.length();
		};
		
		Function<Character[],Integer>fun3=fun2.compose(fun1);
		
		System.out.println(fun3.apply(new Character[]{'a','b'}));


	}}
