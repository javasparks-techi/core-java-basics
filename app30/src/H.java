interface A
{
	void test1();
	void test2();
}
interface B
{
	void test3();
}

class H implements A, B
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
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
