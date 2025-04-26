class Armstrong
{
	public static int countdigit(int n)
	{
		int count=0;
	  	while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static int XpowerN(int x,int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			int ld= n%10;
			res=res*x;
		}
		return res;
	}
	public static void  main(String[] args)
	{	int num=175;
		int temp =num;
		int count=countdigit(num);
		int sum=0;
		while(num!=0)
		{
		int ld=num%10;
		sum=sum+XpowerN(ld,count);
		num=num/10;
		}
		if(temp == sum)
		{
		System.out.println("it is armstrong");
		}
		else{
		System.out.println("not armstrong");
		}
	}
		

}
	
