abstract class A
{
	abstract void test1();

	void test2()
	{
		System.out.println("from test2");
	}
}
abstract class E extends A 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
