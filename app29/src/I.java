abstract class A
{
	abstract void test1();

	void test2()
	{
		System.out.println("from test2");
	}

	abstract int test3();
}
class I extends A 
{
	void test1()
	{
		System.out.println("from test1");
	}
	int test3()
	{
		System.out.println("from test3");
		return 200;
	}
	public static void main(String[] args) 
	{
		I ref = new I();
		ref.test1();
		ref.test2();
		ref.test3();
		System.out.println("done");
	}
}
