class RecursiveExtarctNum
{
	public static void main(String[] args)
	{
		System.out.println("the extracted number is " + extractNum(123));
	}
	public static int extractNum(int num)
	{
		if(num==0)
		return 0;
		return num%10 + extractNum(num/10); 	
	}
}