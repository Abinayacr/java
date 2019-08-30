import java.util.Scanner;
public class javaadd{
	public static void main(String[] args){
		System.out.println("input the 1st no to add");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("input the 2nd no to add");
		int num2=scan.nextInt();
		int num3=num1+num2;
		System.out.println("The ans:"+num3);
	}
}