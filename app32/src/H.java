class H 
{
	static void test(long lon)
	{
	}
	public static void main(String[] args) 
	{
		test((long)5.5);
		double d1 = 4.5;
		float f1 = 1.2f;
		test((long)d1);
		test((long)f1);
		System.out.println("Hello World!");
	}
}
