class Employee1
{
	int id;
	String name;
	
	Employee1()
	{
	System.out.println("emp const");
	}
}

class Developer1 extends Employee1
{
	String skills;
	Developer1()
	{
		//super();
		System.out.println("developer const");
	}
	
	public static void main(String[] args)
	{
		Employee1 e1=new Employee1();
		Developer1 d1=new Developer1();
	}
}