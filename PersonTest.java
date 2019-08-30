import java.util.Scanner;
class Person{
	private String name;
	private int age;
	private String constituency;
	Scanner s;
	
	Person() //default const
	{
		System.out.println("voter eligibility app");
		age=0;
		name="";
		constituency ="Bengaluru";
		s=new Scanner(System.in);
	}
	
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	
	Person(String n,int a,String c)
	{
		name=n;
		age=a;
		constituency=c;
	}
	
	public void input()
	{
		System.out.println("enter ur name:");
		name=s.next();
		System.out.println("enter age");
		age=s.nextInt();
	}
	
	public void print()
	{
		System.out.println("name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("constituency is:"+constituency);
	}
}

class PersonTest
{
	public static void main(String[] args)
	{
		Person objPerson=new Person();
		Person objPerson1=new Person("Ram", 30);
		Person objPerson2=new Person("Mike", 50, "Delhi");
		
		objPerson.input();
		objPerson.print();
		
		//objPerson1.eligible();
		
		objPerson1.print();
		
		objPerson2.print();
	}
}
		