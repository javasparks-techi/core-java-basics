class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(false)
		{
			i = i + 20;
			System.out.println("if block");
		}
		else
		{
			i = i + 30;
			System.out.println("else block stmt1");
			System.out.println("else block stmt2");
			System.out.println("else block stmt3");
		}
		System.out.println("main end:" + i);
	}
}
