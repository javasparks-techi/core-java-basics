class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		//int m = 1, n = 10, o, p = 30, q, r = 40;
		for(int i = 1, System.out.println("init"); 
			test(i); 
			System.out.println("before change:" + i), i++, System.out.println("after change:" + i))
		{
			System.out.println("loop body:" +  i);
		}
		System.out.println("main end");
	}
	static boolean test(int i)
	{
		boolean flag = (i <= 5);
		System.out.println("boolean status for " + i + " is " + flag);
		return flag;
	}
}
