class A
{
	void test()
	{
		System.out.println("from A.test");
	}
}

class D extends A 
{
	void test(int i)
	{
		System.out.println("D.test();
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("----------");
		d1.test(10);
		System.out.println("----------");
	}
}
