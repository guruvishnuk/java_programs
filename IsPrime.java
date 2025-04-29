class IsPrime
{
	public static boolean defprime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void main(String[] args)
	{ 	
		for(int i=1;i<=100;i++)
		{
			System.out.print(defprime(i)+":");
			System.out.println("  "+i);
		}
		

	}


}