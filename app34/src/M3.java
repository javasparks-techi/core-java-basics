class A
{
	static void test()
	{
		System.out.println("from A.test");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("from B.test");
	}
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			A.test();
		}
	}
}
