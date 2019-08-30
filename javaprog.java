import java.util.Scanner;
public class javaprog{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size:");
		n=s.nextInt();
		int numbers[]=new int[n];
		System.out.println("enter array ele:");
		for(i=0;i<n;i++)
		{
			numbers[i]=s.nextInt();
		}
		System.out.println("no of ele in an array is:" + numbers.length);
		System.out.println("1st	ele in an array is:" + numbers[0]);
		System.out.println("last ele in an array is:" + numbers[numbers.length-1]);
		System.out.println("**********************");
		System.out.println("the array contents are:");
		for(int j:numbers)
		System.out.println(j);
	}
}