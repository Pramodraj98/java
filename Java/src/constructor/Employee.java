package constructor;

public class Employee {
String Name;
int sal;
int empid;

Employee(String Name,int sal,int empid){
	this.Name=Name;
	this.sal=sal;
	this.empid=empid;
	System.out.println(this.Name+" "+this.sal+" "+this.empid);
}
public static void main(String[] args) {
	Employee s1=new Employee("Raaghu",100,01);
	Employee s2=new Employee("Dboss",200,02);
	Employee s3=new Employee("Sanku",300,03);
	Employee s4=new Employee("Soma",400,04);
	Employee s5=new Employee("nimmi",500,05);
	//System.out.println(s1.Name+" "+s1.sal+" "+s1.empid);
	
}
}
