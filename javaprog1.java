import java.util.Scanner;
class Employee
{
int emp_id;
String emp_name,dept;
float basic,hra,tax,totalsal;
Scanner s;


void input()
{
s=new Scanner(System.in);
System.out.println("enter emp_id,name,dept&basic salary");
emp_id=s.nextInt();
emp_name=s.next();
dept=s.next();
basic=s.nextFloat();
}

void calculateSal()
{
	hra=basic*.010f;
	tax=basic*.05f;
	totalsal=(basic+hra)-tax;
}

void display()
{
	System.out.println("the emp details:");
	System.out.println("Employee id:" +emp_id);
	System.out.println("Employee name:" +emp_name);
	System.out.println("Department:" +dept);
	System.out.println("tot sal:" +totalsal);
}
}
	

	