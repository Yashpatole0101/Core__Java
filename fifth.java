package function_interface;

import java.util.function.Function;

public class fifth {

	public static void main(String[] args) {
		Function<Character[],String>fun=(t)->{
			String s=new String();
			for(char i:t) {
				s=s+i;
			}
			return s;
		};
		
		
		Function<String,StringBuffer>fun2=(s)->{
		    StringBuffer sb=new StringBuffer(s);
		    return sb.reverse();
		};
		
		Function<Character[],StringBuffer> fun3=fun2.compose(fun);
		System.out.println(fun3.apply(new Character[] {'q','w','e'}));
		

	}

}
