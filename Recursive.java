class Recursive
{
	public static void main(String[] args)
	{
		System.out.println(Factorial(5));

	}
	public static int Factorial(int num)
	{
		if(num==0||num==1)
		{
			return 1 ;
		}		
		return num*Factorial(num-1);
	}
}