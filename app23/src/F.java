class F 
{
	{
		System.out.println("IIB1");
	}

	F()
	{
		this(90);
		System.out.println("F()");
	}

	F(int i)
	{
		System.out.println("F(int)");
	}

	{
		System.out.println("IIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		F f1 = new F();
		System.out.println("----------");
		F f2 = new F(20);
		System.out.println("----------");
		System.out.println("main end");
	}
}
