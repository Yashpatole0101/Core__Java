package day2;

public class Nonprimitive {

	public static void main(String[] args) {
		
		//array of integer
		int[] yash=new int[4];
		yash[0]=10;
		yash[1]=29;
		yash[2]=34;
		yash[3]=56;
		System.out.println(yash[0]);
		System.out.println(yash.length);

		yash[0]=34;
		System.out.println(yash[0]);
		
		
		// array of string
		String[] name=new String[2];
		System.out.println(name);
		name[0]="100";
		name[1]="200";
		System.out.println(name[1]);
		
		//string
		String str="yash";
		System.out.println(str.length());
		
		
		String tr="100";
		System.out.println(100+200+tr+500);
	
}
}