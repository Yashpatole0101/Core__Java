package string;

public class String1 {

	public static void main(String[] args) {
		String str=new String("hello good morning");
		String str1=new String("good"); 
		String str2=new String("good");
		String str3=new String("Good");
		String str4=new String("GOOD");
		String str5=new String("   good   ");
		
		
		
		
		 char g=str.charAt(4);
		 System.out.println(g);
		 System.out.println("*************");
		 
		 
		 
		 char[] d= str1.toCharArray();
		 for (int i=0;i<d.length;i++) {
			 System.out.println(d[i]);
		 }
		 
		 
		 
		 System.out.println("*************");
		 boolean b=str1.equals(str2);
		 System.out.println(b);
		 
		 System.out.println("************");
		 boolean n =str2.equalsIgnoreCase(str3);
		 System.out.println(n);
		 
		 
		 System.out.println("*************");
		 System.out.println(str.toUpperCase());
		 System.out.println(str4.toLowerCase());
		 System.out.println(str.concat( str4));
		 System.err.println(str5);
		 System.out.println(str5.trim());
	}

}
