class U
{
	int i;
	void test()
	{
		System.out.println("test:" + i);
		i = 20;
	}
	public static void main(String[] args) 
	{
		U obj = new U();
		obj.i = 10;
		System.out.println("main1:" + obj.i);
		obj.test();
		System.out.println("main2:" + obj.i);
	}
}
