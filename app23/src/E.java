class E 
{
	{
		System.out.println("IIB1");
	}

	E()
	{
		System.out.println("E()");
	}

	E(int i)
	{
		System.out.println("E(int)");
	}

	{
		System.out.println("IIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1 = new E();
		System.out.println("----------");
		E e2 = new E(20);
		System.out.println("----------");
		System.out.println("main end");
	}
}
