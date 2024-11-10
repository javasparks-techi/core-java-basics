class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if block");
		}
		else
		{
			int i = 110;
			System.out.println("else block stmt1");
			System.out.println("else block stmt2");
			System.out.println("else block stmt3");
		}
		i = 220;
		System.out.println("main end:" + i);
	}
}
