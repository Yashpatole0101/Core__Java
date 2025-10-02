package class_object;
  class Employee{
	  String empID;
	  String empname;
	  double salary;
  }
public class Creating {

	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		
		e1.empID="a1223";
		e1.empname="ram";
		e1.salary=46788.22;
		
		
		System.out.println(e1.empID+" is id of "+e1.empname+" whose salary is "+e1.salary);
		
System.out.println("**************************");
		Employee e2=new Employee();
		e2.empID="gh667";
		e2.empname="omkar";
		e2.salary=3567654;
		
		System.out.println("details of second employeee:"+"\n"+e2.empID+"\n"+e2.empname+"\n"+e2.salary+"\n");
	}

}
