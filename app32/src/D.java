class D 
{
	static void test(long lon)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		byte b1 = 100;
		short s1 = 200;
		int i = 300;
		test(b1);
		test((long)s1);
		test(i);
		System.out.println("done");
	}
}
