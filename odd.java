class odd{
	public static void main(String[] args)
	{
		int i,n;
		System.out.println("Odd\tEven");
		for(i=1;i<=10;i++)
		{
		if(i%2!=0)
		{
			System.out.print(i);
		}
		else
			System.out.print("\t"+i);
			System.out.println();
		}
	}
}