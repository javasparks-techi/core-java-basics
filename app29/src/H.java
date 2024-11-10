abstract class A
{
	abstract void test1();

	void test2()
	{
		System.out.println("from test2");
	}

	abstract int test3();
}
abstract class H extends A 
{
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
