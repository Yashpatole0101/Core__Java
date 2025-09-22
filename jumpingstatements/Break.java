package jumpingstatements;

public class Break {

	public static void main(String[] args) {
		
		
		 for(int i=1;i<=10;i++)
		 {
			 if(i==5) {
				 
				 break;
			 }
			 System.out.println(i);
		 }
		 
		 
		 
		 System.out.println("**************************");
		 int a=1;
		 while(a<=20)
		 {
			 if(a==6)
			 {
				 break;
			 }
			 System.out.println(a);
			 a++;
		 }
			 System.out.println("*************************");
			 
			 
			
			 
			 
			 
		 for(int i=1;i<=3;i++)
		 {
			 for(int j=1;j<=3;j++)
			 {
				 if(j==2)
				 {
					 break ;
				 }
				 System.out.println("i="+i+" , j="+j);
			 }
				 
		 }
		 
		 
		 
		 
		 
		 
		 for(int i=1;i<=50;i++)
		 {
			 if(i%2==0)
			 {
				 
				 if(i==26)
				 {
					 break;
				 }
				 System.out.println(i+"even");
			 }
			 
		 }
		 
		 
		 
		 
		 
		 for(int i=1;i<=100;i++)
		 {
			 if(i%7==0)
			 {
				 System.out.println("first multiple of 7 is:"+i);
				 break;
			 }
			 
		 }

	}

}
