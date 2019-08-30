import java.util.Scanner;
class Student
{
int stud_id;
String stud_name,branch;
float eng,kan,hin,math,sci, totmarks;
Scanner s;


void input()
{
s=new Scanner(System.in);
System.out.println("ENTER STUDENT ID, STUDENT NAME, BRANCH , MARKS:");
stud_id=s.nextInt();
stud_name=s.next();
branch=s.next();
eng=s.nextFloat();
kan=s.nextFloat();
hin=s.nextFloat();
math=s.nextFloat();
sci=s.nextFloat();
}

void calculatemarks()
{
	totmarks=(eng+kan+hin+math+sci)/5;
	
		
}

void display()
{
	System.out.println("-------------------------");
	System.out.println("THE STUDENT DETAILS ARE:");
	System.out.println("-------------------------");
	System.out.println("STUDENT ID:" +stud_id);
	System.out.println("STUDENT NAME:" +stud_name);
	System.out.println("STUDENT BRANCH:" +branch);
	System.out.println("TOTAL MARKS:" +totmarks);
	if(totmarks>90)
	{
		System.out.println("RESULT-DISTINCTION");
	}
	else if(totmarks>=80)
	{
		System.out.println("RESULT-FIRST CLASS");
	}
	else if(totmarks>=70)
	{
		System.out.println("RESULT-SECOND CLASS");
	}
	else if(totmarks>=60)
	{
		System.out.println("RESULT-THIRD CLASS");
	}
	else if(totmarks>=50)
	{
		System.out.println("RESULT-PASS");
	}
	else
	{
		System.out.println("RESULT-FAIL");
	}
	System.out.println("----------------------------------------");
	
}
}





























