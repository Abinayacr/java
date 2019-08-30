class ConstructorDemo
{
	ConstructorDemo()
	{
		System.out.println("In constructor");
	}
	
	void display()
	{
		System.out.println("Display Method");
	}
	public static void main(String[] args)
	{
		ConstructorDemo c1=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo();
		ConstructorDemo c3=new ConstructorDemo();
	}
}

