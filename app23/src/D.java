class D 
{
	{
		System.out.println("IIB1");
	}

	D()
	{
		System.out.println("D()");
	}

	{
		System.out.println("IIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		D d1 = new D();
		System.out.println("----------");
		D d2 = new D();
		System.out.println("----------");
		System.out.println("main end");
	}
}
