package day3;

public class Op_practice {

	public static void main(String[] args) {
		int sum=100;
		
		System.out.println(sum++>=++sum);
		
		
		System.out.println((++sum>=188)&&(sum--<=sum)||(100!=100)&&!true);
		
		
		
		
		int a=98;
		int b=56;
		int c=199;
		int d=11;
		
		boolean p=a++>=d; //t
		boolean q= c==d;  //f
		boolean r= (b<=a);//t
		
		
		System.out.println(p&&q&&r);  
		System.out.println(r||!q&&p||p&&!q);

	}

}
