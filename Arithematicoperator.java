package day3;

public class Arithematicoperator {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=num1+num2;
		System.out.println("addition is:"+num3);//plus operator
		System.out.println(num1-num2);  //minus operator
		System.out.println(num1*num2);  //multiply
		System.out.println(num1/num2);  // division operator
		System.out.println(num1%num2);  //modulus operator
		
	
	
	
	
	//...........increment
		int age=20;
		++age;  //pre increment 21
		age++; //post increment  22
		
		System.out.println(age+(age++)+(++age)+age);
		                   //22+22+24+24
		System.out.println(22+22+24+24);
		System.out.println(age);
		
		
		
	//...................decrement
		int a=10;
		--a;  //9
		a--;  //8
		
		System.out.println((a++)+(a--)-(++a)+(--a)-(++a)+a-(--a));
		                    
		System.out.println(8+9-9+8-9+9-8);
		System.out.println(a);
		
		
		//........................practice
		System.out.println("--------------------------------------------------------");
		
		int b=20;
		++b;
		b--;
		--b;
		b++;
		System.out.println(--b+(b++)-(++b)-(--b)+b-b-(++b));
		                     //19+19-21-20+20-20-21
		System.out.println(19+19-21-20+20-20-21);
		System.out.println(b);
	}

}
