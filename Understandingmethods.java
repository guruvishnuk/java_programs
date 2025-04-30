 class UnderstandingMethods
{
	public static void main(String[] args)
	{
		fact(10);
	}
	public static void fact(int a)
	{
	  int fact=1;
		int n=10;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}	
		System.out.println(fact);
	}
}