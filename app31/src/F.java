class A
{
	void test()
	{
		System.out.println("from A.test");
	}
}

class F extends A 
{
	void test(int i)
	{
		System.out.println("F.test();
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test();
		System.out.println("----------");
	}
}
