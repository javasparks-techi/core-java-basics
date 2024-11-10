class A
{
	void test()
	{
		System.out.println("from A.test");
	}
}

class E extends A 
{
	void test()
	{
		System.out.println("D.test();
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.test();
		System.out.println("----------");
	}
}
