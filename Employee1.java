class Employee1
{
	int id;
	String name;
	
	Employee1()
	{
	System.out.println("emp const");
	}
}

class Developer extends Employee1
{
	String skills;
	Developer()
	{
		super();
		System.out.println("developer const");
	}
	
	public static void main(String[] args)
	{
		Employee1 e1=new Employee1();
		Developer d1=new Developer();
	}
}