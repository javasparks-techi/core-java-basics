class C
{
	C()
	{
		System.out.println("C()");
	}

	C(int i)
	{
		System.out.println("C(int)");
	}

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C obj1 = new C();
		System.out.println("---------");
		C obj2 = new C(10);
		System.out.println("main end");
	}
}
