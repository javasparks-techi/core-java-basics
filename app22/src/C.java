class C
{
	C()
	{
		System.out.println("C()");
	}
	C(double i)
	{
		System.out.println("C(double)");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	C(int i, double j)
	{
		System.out.println("C(int, double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C obj1 = new C(90);
		System.out.println("-----------");
		C obj2 = new C(190);
		System.out.println("-----------");
		C obj3 = new C(1.9);
		System.out.println("-----------");
		C obj4 = new C();
		System.out.println("-----------");
		System.out.println("main end");
	}
}
