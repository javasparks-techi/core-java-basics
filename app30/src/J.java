interface A
{
	void test1();
	void test2();
}
interface B
{
	void test3();
}
interface C extends A, B
{
	void test4()
}
class J implements C
{
	public void test1()
	{
	}
	public void test2()
	{
	}
	public void test3()
	{
	}
	public void test4()
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
